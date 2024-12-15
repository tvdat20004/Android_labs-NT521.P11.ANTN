package razi.apa.ctf.videoPlayer.ui.playback;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.drawerlayout.widget.DrawerLayout;
import b.b.c.l;
import b.l.b.z;
import b.q.q;
import c.c.a.a.g1;
import c.c.a.a.i0;
import c.c.a.a.u1.s0;
import c.c.a.a.w1.m;
import c.c.a.a.w1.o;
import c.c.a.a.x1.u;
import c.c.a.a.z1.l0;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import com.pnikosis.materialishprogress.ProgressWheel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import razi.apa.ctf.videoPlayer.R;
import razi.apa.ctf.videoPlayer.YAVPApp;
import razi.apa.ctf.videoPlayer.feature.playback.VideoPlaybackService;
import razi.apa.ctf.videoPlayer.ui.AppSettingsActivity;

/* loaded from: classes.dex */
public class PlaybackActivity extends l implements YAVPApp.a {
    public static final /* synthetic */ int M = 0;
    public BroadcastReceiver A;
    public f.a.a.a.a.b.a B;
    public long C = 0;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;
    public boolean J = false;
    public boolean K = false;
    public final Handler L = new a(Looper.getMainLooper());
    public DrawerLayout q;
    public FrameLayout r;
    public ProgressWheel s;
    public ProgressWheel t;
    public ImageButton u;
    public TextView v;
    public d w;
    public VideoPlaybackService x;
    public f.a.a.a.a.d.b y;
    public f.a.a.a.a.d.c z;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 2) {
                PlaybackActivity.this.H = false;
                return;
            }
            if (i == 3) {
                PlaybackActivity playbackActivity = PlaybackActivity.this;
                int i2 = PlaybackActivity.M;
                Objects.requireNonNull(playbackActivity);
                return;
            }
            boolean z = true;
            if (i == 4) {
                PlaybackActivity playbackActivity2 = PlaybackActivity.this;
                PlaybackActivity.t(playbackActivity2, true, playbackActivity2.E);
            } else if (i != 5) {
                if (i != 6) {
                    return;
                }
                View decorView = PlaybackActivity.this.getWindow().getDecorView();
                decorView.setSystemUiVisibility(2 | decorView.getVisibility());
                return;
            }
            PlaybackActivity playbackActivity3 = PlaybackActivity.this;
            ProgressWheel progressWheel = playbackActivity3.s;
            if (playbackActivity3.K && !playbackActivity3.E) {
                z = false;
            }
            progressWheel.setWillNotDraw(z);
            PlaybackActivity.this.s.setInstantProgress(0.0f);
            PlaybackActivity.this.s.setLinearProgress(false);
            PlaybackActivity.this.s.c();
            PlaybackActivity.this.J = false;
        }
    }

    public class b extends DrawerLayout.f {
        public b(a aVar) {
        }
    }

    public class c implements f.a.a.a.a.c.b {
        public c(a aVar) {
        }

        public void a(boolean z) {
            if (z) {
                PlaybackActivity.this.L.sendEmptyMessageDelayed(4, 750L);
                return;
            }
            PlaybackActivity.this.L.removeMessages(4);
            PlaybackActivity playbackActivity = PlaybackActivity.this;
            PlaybackActivity.t(playbackActivity, false, playbackActivity.E);
        }

        public void b(String[] strArr) {
            boolean z;
            if (strArr.length <= 0) {
                return;
            }
            PlaybackActivity playbackActivity = PlaybackActivity.this;
            int i = PlaybackActivity.M;
            Objects.requireNonNull(playbackActivity);
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                } else {
                    if (b.h.b.b.a(playbackActivity, strArr[i2]) != 0) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (z) {
                b.h.b.b.b(playbackActivity, strArr, 0);
            }
            if (!z) {
                d.a.a.a.e("onMissingPermissions(): we already have all permissions? reloading media...", new Object[0]);
                PlaybackActivity.this.x.h();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void c() {
            f.a.a.a.a.d.b bVar;
            f.a.a.a.a.d.a aVar = d.a.a.a.a(PlaybackActivity.this.getApplicationContext(), "SCALE_TO_WIDTH", R.bool.DEF_SCALE_TO_WIDTH) ? f.a.a.a.a.d.a.FillWidth : f.a.a.a.a.d.a.Fit;
            if (d.a.a.a.a(PlaybackActivity.this.getApplicationContext(), "DISABLE_GL_EFFECTS", R.bool.DEF_DISABLE_GL_EFFECTS)) {
                PlaybackActivity playbackActivity = PlaybackActivity.this;
                f.a.a.a.a.d.c cVar = new f.a.a.a.a.d.c(PlaybackActivity.this.r.getContext());
                playbackActivity.z = cVar;
                PlaybackActivity playbackActivity2 = PlaybackActivity.this;
                playbackActivity2.z.setSimplePlayer(playbackActivity2.x.f4373b);
                PlaybackActivity.this.z.setPlayerScaleType(aVar);
                bVar = cVar;
            } else {
                PlaybackActivity playbackActivity3 = PlaybackActivity.this;
                f.a.a.a.a.d.b bVar2 = new f.a.a.a.a.d.b(PlaybackActivity.this.r.getContext());
                playbackActivity3.y = bVar2;
                PlaybackActivity playbackActivity4 = PlaybackActivity.this;
                f.a.a.a.a.d.b bVar3 = playbackActivity4.y;
                g1 g1Var = playbackActivity4.x.f4373b;
                g1 g1Var2 = bVar3.f1872c;
                if (g1Var2 != null) {
                    g1Var2.F();
                    bVar3.f1872c = null;
                }
                bVar3.f1872c = g1Var;
                g1Var.f2008f.add(bVar3);
                bVar3.f1871b.s = g1Var;
                PlaybackActivity.this.y.setPlayerScaleType(aVar);
                bVar = bVar2;
            }
            bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            PlaybackActivity.this.r.removeAllViews();
            PlaybackActivity.this.r.addView(bVar);
            PlaybackActivity.this.x(true);
        }
    }

    public class d implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public boolean f4386a = false;

        public d(a aVar) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.a.a.a.e("Service connected!", new Object[0]);
            if (iBinder instanceof VideoPlaybackService.d) {
                PlaybackActivity playbackActivity = PlaybackActivity.this;
                VideoPlaybackService videoPlaybackService = VideoPlaybackService.this;
                playbackActivity.x = videoPlaybackService;
                this.f4386a = true;
                videoPlaybackService.f4375d = playbackActivity.new c(null);
                boolean z = playbackActivity.D;
                throw null;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            d.a.a.a.e("Service Disconnected!", new Object[0]);
            this.f4386a = false;
        }
    }

    public static void t(PlaybackActivity playbackActivity, boolean z, boolean z2) {
        ProgressWheel progressWheel;
        playbackActivity.K = z;
        if (!z) {
            if (!playbackActivity.J) {
                playbackActivity.s.setWillNotDraw(true);
            }
            playbackActivity.t.setWillNotDraw(true);
            return;
        }
        if (z2) {
            playbackActivity.t.setWillNotDraw(false);
            if (playbackActivity.J) {
                return;
            } else {
                progressWheel = playbackActivity.t;
            }
        } else {
            playbackActivity.s.setWillNotDraw(false);
            if (playbackActivity.J) {
                return;
            } else {
                progressWheel = playbackActivity.s;
            }
        }
        progressWheel.c();
    }

    public final void A() {
        View decorView;
        int i;
        if (getResources().getConfiguration().orientation == 2) {
            decorView = getWindow().getDecorView();
            i = 3846;
        } else {
            decorView = getWindow().getDecorView();
            i = 3330;
        }
        decorView.setSystemUiVisibility(i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.H || !d.a.a.a.a(this, "BACK_DOUBLE_PRESS_EN", R.bool.DEF_BACK_DOUBLE_PRESS_EN)) {
            this.f36f.a();
            return;
        }
        this.H = true;
        this.L.sendEmptyMessageDelayed(2, d.a.a.a.b(this, "BACK_DOUBLE_PRESS_TIMEOUT", R.integer.DEF_BACK_DOUBLE_PRESS_TIMEOUT));
        Toast.makeText(this, getString(R.string.toast_press_back_again_to_exit), 0).show();
    }

    @Override // b.b.c.l, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A();
    }

    @Override // b.b.c.l, androidx.activity.ComponentActivity, b.h.b.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        d.a.a.a.e("onCreate of PlaybackActivity called.", new Object[0]);
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.playback_activity);
        this.r = (FrameLayout) findViewById(R.id.pb_playerViewPlaceholder);
        this.v = (TextView) findViewById(R.id.pb_streamTitle);
        this.q = (DrawerLayout) findViewById(R.id.pb_quick_settings_drawer);
        this.s = (ProgressWheel) findViewById(R.id.pb_playerBufferingWheel_normal);
        this.t = (ProgressWheel) findViewById(R.id.pb_playerBufferingWheel_pipmode);
        this.u = (ImageButton) findViewById(R.id.exo_play);
        DrawerLayout drawerLayout = this.q;
        b bVar = new b(null);
        Objects.requireNonNull(drawerLayout);
        if (drawerLayout.u == null) {
            drawerLayout.u = new ArrayList();
        }
        drawerLayout.u.add(bVar);
        throw null;
    }

    @Override // b.b.c.l, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        stopService(new Intent(this, (Class<?>) VideoPlaybackService.class));
    }

    @Override // b.b.c.l, android.app.Activity
    public void onPause() {
        super.onPause();
        if (d.a.a.a.a(this, "PERSIST_VOLUME_EN", R.bool.DEF_PERSIST_VOLUME_EN)) {
            throw null;
        }
        if (!d.a.a.a.a(this, "PERSIST_BRIGHTNESS_EN", R.bool.DEF_PERSIST_BRIGHTNESS_EN)) {
            throw null;
        }
        d.a.a.a.h(this, "PERSIST_BRIGHTNESS", (int) Math.floor(getWindow().getAttributes().screenBrightness * 100.0f), false);
        throw null;
    }

    @Override // b.b.c.l, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.g.f1464a.f1413e.t(z);
        x(!z);
        if (!z) {
            unregisterReceiver(this.A);
            this.E = z;
        } else {
            if (this.A == null) {
                this.A = new f.a.a.a.b.c.b(this);
            }
            registerReceiver(this.A, new IntentFilter("media_control"));
            throw null;
        }
    }

    @Override // b.b.c.l, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        boolean z = false;
        d.a.a.a.e("Request Permission Result received for request id %d", Integer.valueOf(i));
        if (iArr.length > 0 && iArr[0] == 0) {
            z = true;
        }
        if (i != 0) {
            return;
        }
        if (!z) {
            Toast.makeText(this, getString(R.string.toast_no_permissions_granted), 1).show();
            finish();
            return;
        }
        VideoPlaybackService videoPlaybackService = this.x;
        if (videoPlaybackService != null) {
            Uri uri = videoPlaybackService.f4376e;
            if (uri == null) {
                throw new IllegalStateException("reloadMedia(): currentMediaUri is null! did you try to reload before loading?");
            }
            videoPlaybackService.g(uri, videoPlaybackService.i, videoPlaybackService.j);
        }
    }

    @Override // b.b.c.l, android.app.Activity
    public void onResume() {
        super.onResume();
        throw null;
    }

    @Override // b.b.c.l, android.app.Activity
    public void onStart() {
        super.onStart();
        this.w = new d(null);
        bindService(new Intent(this, (Class<?>) VideoPlaybackService.class), this.w, 1);
    }

    @Override // b.b.c.l, android.app.Activity
    public void onStop() {
        super.onStop();
        if (!this.I) {
            v();
        }
        this.I = false;
        d.a.a.a.e("Disconnecting from Playback service...", new Object[0]);
        d dVar = this.w;
        if (dVar == null || !dVar.f4386a) {
            d.a.a.a.g("Playback service is already disconnected?! skipping disconnect.", new Object[0]);
        } else {
            VideoPlaybackService videoPlaybackService = this.x;
            if (videoPlaybackService != null) {
                this.C = videoPlaybackService.c();
                this.D = this.x.b();
                this.x.f4375d = null;
            }
            unbindService(this.w);
        }
        this.L.removeCallbacksAndMessages(null);
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        if (d.a.a.a.a(this, "ENTER_PIP_ON_LEAVE", R.bool.DEF_ENTER_PIP_ON_LEAVE)) {
            VideoPlaybackService videoPlaybackService = this.x;
            if (videoPlaybackService.b() && videoPlaybackService.f4373b.p() == 3) {
                y();
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            A();
        }
    }

    public void playback_OnClick(View view) {
        g1 g1Var;
        g1 g1Var2;
        VideoPlaybackService videoPlaybackService;
        m mVar;
        int id = view.getId();
        if (id == R.id.pb_quick_settings) {
            DrawerLayout drawerLayout = this.q;
            View d2 = drawerLayout.d(8388613);
            if (d2 != null) {
                drawerLayout.n(d2, true);
                return;
            } else {
                StringBuilder j = c.a.a.a.a.j("No drawer view found with gravity ");
                j.append(DrawerLayout.i(8388613));
                throw new IllegalArgumentException(j.toString());
            }
        }
        switch (id) {
            case R.id.pb_screen_rotation_auto /* 2131231071 */:
                throw null;
            case R.id.pb_screen_rotation_landscape /* 2131231072 */:
                throw null;
            case R.id.pb_screen_rotation_portrait /* 2131231073 */:
                throw null;
            default:
                switch (id) {
                    case R.id.qs_btn_a4k_tgl /* 2131231082 */:
                        boolean z = !(this.B != null);
                        if (this.y != null) {
                            d.a.a.a.e("Setting Anime4K Filter to enabled= %b", Boolean.valueOf(z));
                            if (z) {
                                if (this.B == null) {
                                    f.a.a.a.a.b.a aVar = new f.a.a.a.a.b.a(this, R.raw.common, R.raw.colorget, R.raw.colorpush, R.raw.gradget, R.raw.gradpush);
                                    this.B = aVar;
                                    aVar.I = 1;
                                    this.y.setGlFilter(aVar);
                                    if (this.x.f() && (g1Var2 = this.x.f4373b) != null) {
                                        g1Var2.f2008f.add(this.B);
                                    }
                                    int b2 = d.a.a.a.a(this, "ANIME4K_FPS_LIMIT_EN", R.bool.DEF_ANIME4K_FPS_LIMIT_EN) ? d.a.a.a.b(this, "ANIME4K_FPS_LIMIT", R.integer.DEF_ANIME4K_FPS_LIMIT) : -1;
                                    this.B.o = b2;
                                    d.a.a.a.e("Enabled Anime4K with fps limit= %d", Integer.valueOf(b2));
                                }
                            } else if (this.B != null) {
                                if (this.x.f() && (g1Var = this.x.f4373b) != null) {
                                    g1Var.f2008f.remove(this.B);
                                }
                                this.y.setGlFilter(null);
                                this.B = null;
                                d.a.a.a.e("Disabled Anime4K", new Object[0]);
                            }
                        }
                        if (this.B != null) {
                            getColor(R.color.quick_settings_item_tint_active);
                            throw null;
                        }
                        getColor(R.color.quick_settings_item_tint_default);
                        throw null;
                    case R.id.qs_btn_app_settings /* 2131231083 */:
                        startActivity(new Intent(this, (Class<?>) AppSettingsActivity.class));
                        return;
                    default:
                        switch (id) {
                            case R.id.qs_btn_jump_to /* 2131231086 */:
                                f.a.a.a.b.c.a aVar2 = new f.a.a.a.b.c.a();
                                z n = n();
                                aVar2.h0 = this.x.f4373b;
                                aVar2.f0 = false;
                                aVar2.g0 = true;
                                b.l.b.a aVar3 = new b.l.b.a(n);
                                aVar3.f(0, aVar2, "tag_jump_to_dialog", 1);
                                aVar3.d();
                                throw null;
                            case R.id.qs_btn_pip /* 2131231087 */:
                                y();
                                return;
                            case R.id.qs_btn_quality /* 2131231088 */:
                                if (!this.w.f4386a || (videoPlaybackService = this.x) == null || !videoPlaybackService.f() || (mVar = this.x.f4377f) == null) {
                                    return;
                                }
                                final u uVar = new u(this, "", mVar, 0);
                                uVar.f3499e = false;
                                uVar.f3500f = false;
                                uVar.g = false;
                                AlertDialog.Builder builder = new AlertDialog.Builder(uVar.f3495a);
                                View inflate = LayoutInflater.from(builder.getContext()).inflate(R.layout.exo_track_selection_dialog, (ViewGroup) null);
                                final TrackSelectionView trackSelectionView = (TrackSelectionView) inflate.findViewById(R.id.exo_track_selection_view);
                                trackSelectionView.setAllowMultipleOverrides(uVar.f3500f);
                                trackSelectionView.setAllowAdaptiveSelections(uVar.f3499e);
                                trackSelectionView.setShowDisableOption(uVar.g);
                                o.a aVar4 = uVar.f3496b;
                                int i = uVar.f3497c;
                                boolean z2 = uVar.h;
                                List<m.a> list = uVar.i;
                                trackSelectionView.l = aVar4;
                                trackSelectionView.m = i;
                                trackSelectionView.o = z2;
                                trackSelectionView.p = null;
                                int size = trackSelectionView.i ? list.size() : Math.min(list.size(), 1);
                                while (r4 < size) {
                                    m.a aVar5 = list.get(r4);
                                    trackSelectionView.g.put(aVar5.f3424b, aVar5);
                                    r4++;
                                }
                                trackSelectionView.c();
                                builder.setTitle("").setView(inflate).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: c.c.a.a.x1.d
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i2) {
                                        i0 i0Var;
                                        u uVar2 = u.this;
                                        TrackSelectionView trackSelectionView2 = trackSelectionView;
                                        e eVar = uVar2.f3498d;
                                        boolean isDisabled = trackSelectionView2.getIsDisabled();
                                        List<m.a> overrides = trackSelectionView2.getOverrides();
                                        c.c.a.a.w1.m mVar2 = eVar.f3463a;
                                        c.c.a.a.w1.k kVar = eVar.f3464b;
                                        int i3 = eVar.f3465c;
                                        s0 s0Var = eVar.f3466d;
                                        m.a aVar6 = overrides.isEmpty() ? null : overrides.get(0);
                                        String str = kVar.f3444b;
                                        String str2 = kVar.f3445c;
                                        boolean z3 = kVar.f3446d;
                                        int i4 = kVar.f3447e;
                                        int i5 = kVar.g;
                                        int i6 = kVar.h;
                                        int i7 = kVar.i;
                                        int i8 = kVar.j;
                                        boolean z4 = kVar.k;
                                        boolean z5 = kVar.l;
                                        boolean z6 = kVar.m;
                                        int i9 = kVar.n;
                                        int i10 = kVar.o;
                                        boolean z7 = kVar.p;
                                        int i11 = kVar.q;
                                        int i12 = kVar.r;
                                        boolean z8 = kVar.s;
                                        boolean z9 = kVar.t;
                                        boolean z10 = kVar.u;
                                        boolean z11 = kVar.v;
                                        boolean z12 = kVar.w;
                                        boolean z13 = kVar.x;
                                        int i13 = kVar.y;
                                        SparseArray sparseArray = new SparseArray();
                                        int i14 = 0;
                                        for (SparseArray<Map<s0, m.a>> sparseArray2 = kVar.z; i14 < sparseArray2.size(); sparseArray2 = sparseArray2) {
                                            sparseArray.put(sparseArray2.keyAt(i14), new HashMap(sparseArray2.valueAt(i14)));
                                            i14++;
                                            str2 = str2;
                                        }
                                        String str3 = str2;
                                        SparseBooleanArray clone = kVar.A.clone();
                                        Map map = (Map) sparseArray.get(i3);
                                        if (map != null && !map.isEmpty()) {
                                            sparseArray.remove(i3);
                                        }
                                        if (clone.get(i3) != isDisabled) {
                                            if (isDisabled) {
                                                clone.put(i3, true);
                                            } else {
                                                clone.delete(i3);
                                            }
                                        }
                                        if (aVar6 != null) {
                                            Map map2 = (Map) sparseArray.get(i3);
                                            if (map2 == null) {
                                                map2 = new HashMap();
                                                sparseArray.put(i3, map2);
                                            }
                                            if (!map2.containsKey(s0Var) || !l0.a(map2.get(s0Var), aVar6)) {
                                                map2.put(s0Var, aVar6);
                                            }
                                        }
                                        c.c.a.a.w1.k kVar2 = new c.c.a.a.w1.k(i5, i6, i7, i8, z4, z5, z6, i9, i10, z7, str, i11, i12, z8, z9, z10, str3, z3, i4, z11, z12, z13, i13, sparseArray, clone);
                                        Objects.requireNonNull(mVar2);
                                        if (mVar2.f3423e.getAndSet(kVar2).equals(kVar2) || (i0Var = mVar2.f3448a) == null) {
                                            return;
                                        }
                                        i0Var.h.c(11);
                                    }
                                }).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
                                throw null;
                            case R.id.qs_btn_repeat_tgl /* 2131231089 */:
                                if (((f.a.a.a.b.c.c.a) findViewById(R.id.qs_btn_repeat_tgl)) == null) {
                                    return;
                                }
                                VideoPlaybackService videoPlaybackService2 = this.x;
                                boolean a2 = true ^ videoPlaybackService2.a();
                                if (videoPlaybackService2.f()) {
                                    g1 g1Var3 = videoPlaybackService2.f4373b;
                                    r4 = a2 ? 2 : 0;
                                    g1Var3.N();
                                    g1Var3.f2005c.b(r4);
                                }
                                if (this.x.a()) {
                                    getColor(R.color.quick_settings_item_tint_active);
                                    throw null;
                                }
                                getColor(R.color.quick_settings_item_tint_default);
                                throw null;
                            case R.id.qs_btn_skip_intro /* 2131231090 */:
                                VideoPlaybackService videoPlaybackService3 = this.x;
                                if (videoPlaybackService3 != null) {
                                    videoPlaybackService3.i(85000L);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                }
        }
    }

    public final RemoteAction u(int i, int i2, int i3, int i4) {
        if (l0.f3761a < 26) {
            return null;
        }
        return new RemoteAction(Icon.createWithResource(this, i2), getString(i3), getString(i4), PendingIntent.getBroadcast(this, i, new Intent("media_control").putExtra("control_type", i), 0));
    }

    public final void v() {
        VideoPlaybackService videoPlaybackService = this.x;
        if (videoPlaybackService == null || !videoPlaybackService.f()) {
            d.a.a.a.e("Cannot save current playback position: player or playback service invalid!", new Object[0]);
        } else {
            w(this.x.c());
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public final void w(long j) {
        SharedPreferences a2 = q.a(getApplicationContext());
        if (a2 == null) {
            d.a.a.a.e("cannot save playback position: ConfigUtil.getAppConfig() returned null!", new Object[0]);
        } else {
            a2.edit().putLong("LAST_PLAYED_POSITION", j).commit();
            d.a.a.a.e("Saved LAST_PLAYED_POSITION", new Object[0]);
        }
    }

    public final void x(boolean z) {
        d.a.a.a.e("setUseController() useController= %b", Boolean.valueOf(z));
        d.a.a.a.g("setUseController(): either playerControlView or playbackService is not valid!", new Object[0]);
    }

    public final void y() {
        if (l0.f3761a >= 26 && z() != null) {
            x(false);
            this.q.c(false);
            throw null;
        }
    }

    public final PictureInPictureParams z() {
        if (l0.f3761a < 26) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(u(3, R.drawable.ic_fast_rewind_black_24dp, R.string.pip_title_rewind, R.string.exo_controls_rewind_description));
        arrayList.add(this.F ? u(1, R.drawable.ic_replay_black_24dp, R.string.pip_title_replay, R.string.exo_controls_play_description) : this.x.b() ? u(0, R.drawable.ic_pause_black_24dp, R.string.pip_title_pause, R.string.exo_controls_pause_description) : u(0, R.drawable.ic_play_arrow_black_24dp, R.string.pip_title_play, R.string.exo_controls_play_description));
        arrayList.add(u(2, R.drawable.ic_fast_forward_black_24dp, R.string.pip_title_forward, R.string.exo_controls_fastforward_description));
        PictureInPictureParams build = new PictureInPictureParams.Builder().setActions(arrayList).build();
        setPictureInPictureParams(build);
        return build;
    }
}
