package androidx.activity;

import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;

/* loaded from: classes.dex */
public final class SystemBarStyle {
    public static final Companion Companion = new Companion(null);
    private final int darkScrim;
    private final Oooo000 detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        public static /* synthetic */ SystemBarStyle auto$default(Companion companion, int i, int i2, Oooo000 oooo000, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                oooo000 = SystemBarStyle$Companion$auto$1.INSTANCE;
            }
            return companion.auto(i, i2, oooo000);
        }

        public final SystemBarStyle auto(int i, int i2) {
            return auto$default(this, i, i2, null, 4, null);
        }

        public final SystemBarStyle dark(int i) {
            return new SystemBarStyle(i, i, 2, SystemBarStyle$Companion$dark$1.INSTANCE, null);
        }

        public final SystemBarStyle light(int i, int i2) {
            return new SystemBarStyle(i, i2, 1, SystemBarStyle$Companion$light$1.INSTANCE, null);
        }

        private Companion() {
        }

        public final SystemBarStyle auto(int i, int i2, Oooo000 detectDarkMode) {
            OooOo.OooO0o0(detectDarkMode, "detectDarkMode");
            return new SystemBarStyle(i, i2, 0, detectDarkMode, null);
        }
    }

    public /* synthetic */ SystemBarStyle(int i, int i2, int i3, Oooo000 oooo000, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(i, i2, i3, oooo000);
    }

    public static final SystemBarStyle auto(int i, int i2) {
        return Companion.auto(i, i2);
    }

    public static final SystemBarStyle dark(int i) {
        return Companion.dark(i);
    }

    public static final SystemBarStyle light(int i, int i2) {
        return Companion.light(i, i2);
    }

    public final int getDarkScrim$activity_release() {
        return this.darkScrim;
    }

    public final Oooo000 getDetectDarkMode$activity_release() {
        return this.detectDarkMode;
    }

    public final int getNightMode$activity_release() {
        return this.nightMode;
    }

    public final int getScrim$activity_release(boolean z) {
        return z ? this.darkScrim : this.lightScrim;
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean z) {
        if (this.nightMode == 0) {
            return 0;
        }
        return z ? this.darkScrim : this.lightScrim;
    }

    private SystemBarStyle(int i, int i2, int i3, Oooo000 oooo000) {
        this.lightScrim = i;
        this.darkScrim = i2;
        this.nightMode = i3;
        this.detectDarkMode = oooo000;
    }

    public static final SystemBarStyle auto(int i, int i2, Oooo000 oooo000) {
        return Companion.auto(i, i2, oooo000);
    }
}
