package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.C3395l;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.demandOnly.InterfaceC3377h;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.OooOo;

/* renamed from: com.ironsource.mediationsdk.demandOnly.q */
/* loaded from: classes2.dex */
public interface InterfaceC3386q {

    /* renamed from: com.ironsource.mediationsdk.demandOnly.q$a */
    public static final class a {

        /* renamed from: a */
        private final String f9779a;

        public a(String adFormat) {
            OooOo.OooO0o0(adFormat, "adFormat");
            this.f9779a = adFormat;
        }

        /* renamed from: a */
        public final IronSourceError m10261a(InterfaceC3377h loadParams) {
            OooOo.OooO0o0(loadParams, "loadParams");
            InterfaceC3377h.b bVar = (InterfaceC3377h.b) loadParams;
            if (bVar.m10206f() == null) {
                return new IronSourceError(1060, OooO0oO.OooOo.OooOOOo(new StringBuilder(), this.f9779a, " was initialized and loaded without Activity"));
            }
            if (bVar.m10207g() == null) {
                return new IronSourceError(510, "Missing banner layout");
            }
            if (bVar.m10207g().isDestroyed()) {
                return new IronSourceError(510, "Banner layout is destroyed");
            }
            ISBannerSize size = bVar.m10207g().getSize();
            if (size == null) {
                return new IronSourceError(510, "Missing banner size");
            }
            if (C3395l.f9871f == size.getDescription() && (size.getHeight() <= 0 || size.getWidth() <= 0)) {
                return new IronSourceError(510, "Unsupported banner size. Height and width must be bigger than 0");
            }
            if (bVar.mo10203c() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String strMo10202b = bVar.mo10202b();
            if ((strMo10202b == null || strMo10202b.length() == 0) && loadParams.mo10204d()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.demandOnly.q$b */
    public static final class b {

        /* renamed from: a */
        private final String f9780a;

        public b(String adFormat) {
            OooOo.OooO0o0(adFormat, "adFormat");
            this.f9780a = adFormat;
        }

        /* renamed from: a */
        public final IronSourceError m10262a(InterfaceC3377h.d loadParams) {
            OooOo.OooO0o0(loadParams, "loadParams");
            if (loadParams.mo9399e() == null) {
                return new IronSourceError(1060, OooO0oO.OooOo.OooOOOo(new StringBuilder(), this.f9780a, " was initialized and loaded without Activity"));
            }
            if (loadParams.mo10203c() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String strMo10202b = loadParams.mo10202b();
            if ((strMo10202b == null || strMo10202b.length() == 0) && loadParams.mo10204d()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    /* renamed from: a */
    IronSourceError mo10205a();
}
