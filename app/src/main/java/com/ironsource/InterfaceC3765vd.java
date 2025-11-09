package com.ironsource;

import android.app.Activity;

/* renamed from: com.ironsource.vd */
/* loaded from: classes2.dex */
public interface InterfaceC3765vd {

    /* renamed from: com.ironsource.vd$a */
    public static final class a {

        /* renamed from: a */
        private final c f12357a;

        public a(c strategyType) {
            kotlin.jvm.internal.OooOo.OooO0o0(strategyType, "strategyType");
            this.f12357a = strategyType;
        }

        /* renamed from: a */
        public static /* synthetic */ a m12769a(a aVar, c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = aVar.f12357a;
            }
            return aVar.m12770a(cVar);
        }

        /* renamed from: b */
        public final c m12772b() {
            return this.f12357a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f12357a == ((a) obj).f12357a;
        }

        public int hashCode() {
            return this.f12357a.hashCode();
        }

        public String toString() {
            return "Config(strategyType=" + this.f12357a + ')';
        }

        /* renamed from: a */
        public final a m12770a(c strategyType) {
            kotlin.jvm.internal.OooOo.OooO0o0(strategyType, "strategyType");
            return new a(strategyType);
        }

        /* renamed from: a */
        public final c m12771a() {
            return this.f12357a;
        }
    }

    /* renamed from: com.ironsource.vd$b */
    public static final class b {

        /* renamed from: com.ironsource.vd$b$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f12358a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.SINGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_SHOW_SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_LOAD_SUCCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f12358a = iArr;
            }
        }

        /* renamed from: a */
        public final InterfaceC3765vd m12773a(C3349m1 adTools, a config, InterfaceC3590rd fullscreenAdUnitFactory, InterfaceC3695td fullscreenAdUnitListener, InterfaceC3730ud listener) {
            kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
            kotlin.jvm.internal.OooOo.OooO0o0(config, "config");
            kotlin.jvm.internal.OooOo.OooO0o0(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
            kotlin.jvm.internal.OooOo.OooO0o0(fullscreenAdUnitListener, "fullscreenAdUnitListener");
            kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
            int i = a.f12358a[config.m12772b().ordinal()];
            if (i == 1) {
                return new C3253je(adTools, config, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i == 2) {
                return new C3004ce(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i == 3) {
                return new C3799wd(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            throw new OooOOO0.OooO00o();
        }
    }

    /* renamed from: com.ironsource.vd$c */
    public enum c {
        SINGLE("Single"),
        PROGRESSIVE_ON_SHOW_SUCCESS("OnShowSuccess"),
        PROGRESSIVE_ON_LOAD_SUCCESS("OnLoadSuccess");


        /* renamed from: a */
        private final String f12363a;

        c(String str) {
            this.f12363a = str;
        }

        /* renamed from: b */
        public final String m12775b() {
            return this.f12363a;
        }
    }

    /* renamed from: a */
    void mo8113a(Activity activity);

    void loadAd();
}
