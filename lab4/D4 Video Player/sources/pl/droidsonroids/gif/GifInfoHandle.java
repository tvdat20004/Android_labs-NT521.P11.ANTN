package pl.droidsonroids.gif;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.os.Build;
import android.system.Os;
import d.a.a.a;
import e.a.b.g;
import java.io.FileDescriptor;
import java.io.IOException;

/* loaded from: classes.dex */
public final class GifInfoHandle {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4369b = 0;

    /* renamed from: a, reason: collision with root package name */
    public volatile long f4370a;

    static {
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            if (a.f4288a == null) {
                try {
                    a.f4288a = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
                } catch (Exception e2) {
                    throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e2);
                }
            }
            new g().c(a.f4288a, "pl_droidsonroids_gif", null, null);
        }
    }

    public GifInfoHandle(AssetFileDescriptor assetFileDescriptor) {
        int createTempNativeFileDescriptor;
        try {
            FileDescriptor fileDescriptor = assetFileDescriptor.getFileDescriptor();
            long startOffset = assetFileDescriptor.getStartOffset();
            if (Build.VERSION.SDK_INT > 27) {
                try {
                    createTempNativeFileDescriptor = createTempNativeFileDescriptor();
                    Os.dup2(fileDescriptor, createTempNativeFileDescriptor);
                } finally {
                }
            } else {
                createTempNativeFileDescriptor = extractNativeFileDescriptor(fileDescriptor, false);
            }
            this.f4370a = openNativeFileDescriptor(createTempNativeFileDescriptor, startOffset);
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public GifInfoHandle(String str) {
        this.f4370a = openFile(str);
    }

    public static native int createTempNativeFileDescriptor();

    public static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z);

    public static native void free(long j);

    public static native int getCurrentFrameIndex(long j);

    public static native int getCurrentLoop(long j);

    public static native int getCurrentPosition(long j);

    public static native int getDuration(long j);

    public static native int getHeight(long j);

    public static native int getLoopCount(long j);

    public static native int getNativeErrorCode(long j);

    public static native int getNumberOfFrames(long j);

    public static native long[] getSavedState(long j);

    public static native int getWidth(long j);

    public static native boolean isOpaque(long j);

    public static native long openFile(String str);

    public static native long openNativeFileDescriptor(int i, long j);

    public static native long renderFrame(long j, Bitmap bitmap);

    public static native boolean reset(long j);

    public static native long restoreRemainder(long j);

    public static native int restoreSavedState(long j, long[] jArr, Bitmap bitmap);

    public static native void saveRemainder(long j);

    public static native void seekToTime(long j, int i, Bitmap bitmap);

    public static native void setLoopCount(long j, char c2);

    public synchronized int a() {
        return getHeight(this.f4370a);
    }

    public synchronized int b() {
        return getNumberOfFrames(this.f4370a);
    }

    public synchronized int c() {
        return getWidth(this.f4370a);
    }

    public synchronized boolean d() {
        return this.f4370a == 0;
    }

    public void finalize() {
        try {
            synchronized (this) {
                free(this.f4370a);
                this.f4370a = 0L;
            }
        } finally {
            super.finalize();
        }
    }
}
