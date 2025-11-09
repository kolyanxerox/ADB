package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes3.dex */
public class FlutterOverlaySurface {

    /* renamed from: id */
    private final int f13202id;

    @NonNull
    private final Surface surface;

    public FlutterOverlaySurface(int i, @NonNull Surface surface) {
        this.f13202id = i;
        this.surface = surface;
    }

    public int getId() {
        return this.f13202id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
