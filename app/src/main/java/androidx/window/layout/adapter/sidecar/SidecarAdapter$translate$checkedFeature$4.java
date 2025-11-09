package androidx.window.layout.adapter.sidecar;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;

/* loaded from: classes.dex */
public final class SidecarAdapter$translate$checkedFeature$4 extends Oooo000 implements o00O0Oo.Oooo000 {
    public static final SidecarAdapter$translate$checkedFeature$4 INSTANCE = new SidecarAdapter$translate$checkedFeature$4();

    public SidecarAdapter$translate$checkedFeature$4() {
        super(1);
    }

    @Override // o00O0Oo.Oooo000
    public final Boolean invoke(SidecarDisplayFeature require) {
        OooOo.OooO0o0(require, "$this$require");
        return Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
    }
}
