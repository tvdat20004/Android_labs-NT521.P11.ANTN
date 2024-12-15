package b.b.c;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class x implements Window.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final Window.Callback f491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f492c;

    public x(f0 f0Var, Window.Callback callback) {
        this.f492c = f0Var;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f491b = callback;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.ActionMode a(android.view.ActionMode.Callback r11) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.c.x.a(android.view.ActionMode$Callback):android.view.ActionMode");
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f491b.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f492c.v(keyEvent) || this.f491b.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r3 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        if (r7 != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f491b
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L70
            b.b.c.f0 r0 = r6.f492c
            int r3 = r7.getKeyCode()
            r0.E()
            b.b.c.a r4 = r0.i
            if (r4 == 0) goto L3f
            b.b.c.r0 r4 = (b.b.c.r0) r4
            b.b.c.q0 r4 = r4.i
            if (r4 != 0) goto L1e
            goto L3b
        L1e:
            b.b.h.m.l r4 = r4.f476e
            if (r4 == 0) goto L3b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r2) goto L32
            r5 = r2
            goto L33
        L32:
            r5 = r1
        L33:
            r4.setQwertyMode(r5)
            boolean r3 = r4.performShortcut(r3, r7, r1)
            goto L3c
        L3b:
            r3 = r1
        L3c:
            if (r3 == 0) goto L3f
            goto L6b
        L3f:
            b.b.c.d0 r3 = r0.G
            if (r3 == 0) goto L54
            int r4 = r7.getKeyCode()
            boolean r3 = r0.I(r3, r4, r7, r2)
            if (r3 == 0) goto L54
            b.b.c.d0 r7 = r0.G
            if (r7 == 0) goto L6b
            r7.l = r2
            goto L6b
        L54:
            b.b.c.d0 r3 = r0.G
            if (r3 != 0) goto L6d
            b.b.c.d0 r3 = r0.C(r1)
            r0.J(r3, r7)
            int r4 = r7.getKeyCode()
            boolean r7 = r0.I(r3, r4, r7, r2)
            r3.k = r1
            if (r7 == 0) goto L6d
        L6b:
            r7 = r2
            goto L6e
        L6d:
            r7 = r1
        L6e:
            if (r7 == 0) goto L71
        L70:
            r1 = r2
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.c.x.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f491b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f491b.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f491b.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f491b.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f491b.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f491b.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof b.b.h.m.l)) {
            return this.f491b.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i) {
        return this.f491b.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f491b.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f491b.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        this.f491b.onMenuOpened(i, menu);
        f0 f0Var = this.f492c;
        Objects.requireNonNull(f0Var);
        if (i == 108) {
            f0Var.E();
            a aVar = f0Var.i;
            if (aVar != null) {
                aVar.a(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.f491b.onPanelClosed(i, menu);
        f0 f0Var = this.f492c;
        Objects.requireNonNull(f0Var);
        if (i == 108) {
            f0Var.E();
            a aVar = f0Var.i;
            if (aVar != null) {
                aVar.a(false);
                return;
            }
            return;
        }
        if (i == 0) {
            d0 C = f0Var.C(i);
            if (C.m) {
                f0Var.t(C, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
        this.f491b.onPointerCaptureChanged(z);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        b.b.h.m.l lVar = menu instanceof b.b.h.m.l ? (b.b.h.m.l) menu : null;
        if (i == 0 && lVar == null) {
            return false;
        }
        if (lVar != null) {
            lVar.x = true;
        }
        boolean onPreparePanel = this.f491b.onPreparePanel(i, view, menu);
        if (lVar != null) {
            lVar.x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        b.b.h.m.l lVar = this.f492c.C(0).h;
        if (lVar != null) {
            this.f491b.onProvideKeyboardShortcuts(list, lVar, i);
        } else {
            this.f491b.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f491b.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f491b.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        this.f491b.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        Objects.requireNonNull(this.f492c);
        return i != 0 ? this.f491b.onWindowStartingActionMode(callback, i) : a(callback);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f491b.onSearchRequested(searchEvent);
    }
}
