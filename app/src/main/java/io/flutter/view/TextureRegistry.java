package io.flutter.view;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public interface TextureRegistry {

    @Keep
    public interface GLTextureConsumer {
        @NonNull
        SurfaceTexture getSurfaceTexture();
    }

    @Keep
    public interface ImageConsumer {
        @Nullable
        Image acquireLatestImage();
    }

    @Keep
    public interface ImageTextureEntry extends TextureEntry {
        void pushImage(Image image);
    }

    public interface OnFrameConsumedListener {
        void onFrameConsumed();
    }

    public interface OnTrimMemoryListener {
        void onTrimMemory(int i);
    }

    public enum SurfaceLifecycle {
        manual,
        resetInBackground
    }

    @Keep
    public interface SurfaceProducer extends TextureEntry {

        public interface Callback {
            default void onSurfaceAvailable() {
                onSurfaceCreated();
            }

            default void onSurfaceCleanup() {
                onSurfaceDestroyed();
            }

            @Deprecated(forRemoval = true, since = "Flutter 3.27")
            default void onSurfaceCreated() {
            }

            @Deprecated(forRemoval = true, since = "Flutter 3.28")
            default void onSurfaceDestroyed() {
            }
        }

        Surface getForcedNewSurface();

        int getHeight();

        Surface getSurface();

        int getWidth();

        boolean handlesCropAndRotation();

        void scheduleFrame();

        void setCallback(Callback callback);

        void setSize(int i, int i2);
    }

    @Keep
    public interface SurfaceTextureEntry extends TextureEntry {
        default void setOnFrameConsumedListener(@Nullable OnFrameConsumedListener onFrameConsumedListener) {
        }

        default void setOnTrimMemoryListener(@Nullable OnTrimMemoryListener onTrimMemoryListener) {
        }

        @NonNull
        SurfaceTexture surfaceTexture();
    }

    public interface TextureEntry {
        /* renamed from: id */
        long mo13467id();

        void release();
    }

    @NonNull
    ImageTextureEntry createImageTexture();

    @NonNull
    default SurfaceProducer createSurfaceProducer() {
        return createSurfaceProducer(SurfaceLifecycle.manual);
    }

    @NonNull
    SurfaceProducer createSurfaceProducer(SurfaceLifecycle surfaceLifecycle);

    @NonNull
    SurfaceTextureEntry createSurfaceTexture();

    default void onTrimMemory(int i) {
    }

    @NonNull
    SurfaceTextureEntry registerSurfaceTexture(@NonNull SurfaceTexture surfaceTexture);
}
