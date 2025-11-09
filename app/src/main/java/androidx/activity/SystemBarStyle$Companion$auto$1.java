package androidx.activity;

import android.content.res.Resources;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;

/* loaded from: classes.dex */
public final class SystemBarStyle$Companion$auto$1 extends Oooo000 implements o00O0Oo.Oooo000 {
    public static final SystemBarStyle$Companion$auto$1 INSTANCE = new SystemBarStyle$Companion$auto$1();

    public SystemBarStyle$Companion$auto$1() {
        super(1);
    }

    @Override // o00O0Oo.Oooo000
    public final Boolean invoke(Resources resources) {
        OooOo.OooO0o0(resources, "resources");
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
