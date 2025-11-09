package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import com.ironsource.InterfaceC3238j;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.InterfaceC3386q;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* renamed from: com.ironsource.mediationsdk.demandOnly.h */
/* loaded from: classes2.dex */
public interface InterfaceC3377h extends InterfaceC3386q {

    /* renamed from: com.ironsource.mediationsdk.demandOnly.h$a */
    public static abstract class a implements InterfaceC3377h {

        /* renamed from: a */
        private final String f9722a;

        /* renamed from: b */
        private final String f9723b;

        /* renamed from: c */
        private final boolean f9724c;

        public a(String str, String str2, boolean z) {
            this.f9722a = str;
            this.f9723b = str2;
            this.f9724c = z;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3386q
        /* renamed from: a */
        public abstract IronSourceError mo10205a();

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3377h
        /* renamed from: b */
        public String mo10202b() {
            return this.f9723b;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3377h
        /* renamed from: c */
        public String mo10203c() {
            return this.f9722a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3377h
        /* renamed from: d */
        public boolean mo10204d() {
            return this.f9724c;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.demandOnly.h$b */
    public static final class b extends a {

        /* renamed from: d */
        private final String f9725d;

        /* renamed from: e */
        private final Activity f9726e;

        /* renamed from: f */
        private final ISDemandOnlyBannerLayout f9727f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String adFormat, Activity activity, String str, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str2, boolean z) {
            super(str, str2, z);
            OooOo.OooO0o0(adFormat, "adFormat");
            this.f9725d = adFormat;
            this.f9726e = activity;
            this.f9727f = iSDemandOnlyBannerLayout;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3377h.a, com.ironsource.mediationsdk.demandOnly.InterfaceC3386q
        /* renamed from: a */
        public IronSourceError mo10205a() {
            IronSourceError ironSourceErrorM10261a = new InterfaceC3386q.a(this.f9725d).m10261a(this);
            if (ironSourceErrorM10261a != null) {
                return ironSourceErrorM10261a;
            }
            return null;
        }

        /* renamed from: f */
        public final Activity m10206f() {
            return this.f9726e;
        }

        /* renamed from: g */
        public final ISDemandOnlyBannerLayout m10207g() {
            return this.f9727f;
        }

        public /* synthetic */ b(String str, Activity activity, String str2, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str3, boolean z, int i, OooOO0O oooOO0O) {
            this(str, activity, str2, iSDemandOnlyBannerLayout, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.demandOnly.h$c */
    public static final class c {

        /* renamed from: a */
        private String f9728a = "";

        /* renamed from: b */
        private Activity f9729b;

        /* renamed from: c */
        private String f9730c;

        /* renamed from: d */
        private boolean f9731d;

        /* renamed from: e */
        private String f9732e;

        /* renamed from: f */
        private ISDemandOnlyBannerLayout f9733f;

        /* renamed from: a */
        public final b m10208a() {
            return new b(this.f9728a, this.f9729b, this.f9730c, this.f9733f, this.f9732e, this.f9731d);
        }

        /* renamed from: b */
        public final c m10215b(String str) {
            this.f9730c = str;
            return this;
        }

        /* renamed from: a */
        public final c m10209a(Activity activity) {
            this.f9729b = activity;
            return this;
        }

        /* renamed from: b */
        public final d m10216b() {
            return new d(this.f9728a, this.f9729b, this.f9730c, this.f9732e, this.f9731d);
        }

        /* renamed from: a */
        public final c m10210a(Activity activity, Activity activity2) {
            if (activity == null) {
                activity = activity2;
            }
            this.f9729b = activity;
            return this;
        }

        /* renamed from: a */
        public final c m10211a(IronSource.AD_UNIT adFormat) {
            OooOo.OooO0o0(adFormat, "adFormat");
            String string = adFormat.toString();
            OooOo.OooO0Oo(string, "adFormat.toString()");
            this.f9728a = string;
            return this;
        }

        /* renamed from: a */
        public final c m10212a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
            this.f9733f = iSDemandOnlyBannerLayout;
            return this;
        }

        /* renamed from: a */
        public final c m10213a(String str) {
            this.f9732e = str;
            return this;
        }

        /* renamed from: a */
        public final c m10214a(boolean z) {
            this.f9731d = z;
            return this;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.demandOnly.h$d */
    public static final class d extends a implements InterfaceC3238j {

        /* renamed from: d */
        private final String f9734d;

        /* renamed from: e */
        private final Activity f9735e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String adFormat, Activity activity, String str, String str2, boolean z) {
            super(str, str2, z);
            OooOo.OooO0o0(adFormat, "adFormat");
            this.f9734d = adFormat;
            this.f9735e = activity;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3377h.a, com.ironsource.mediationsdk.demandOnly.InterfaceC3386q
        /* renamed from: a */
        public IronSourceError mo10205a() {
            IronSourceError ironSourceErrorM10262a = new InterfaceC3386q.b(this.f9734d).m10262a(this);
            if (ironSourceErrorM10262a != null) {
                return ironSourceErrorM10262a;
            }
            return null;
        }

        @Override // com.ironsource.InterfaceC3238j
        /* renamed from: e */
        public Activity mo9399e() {
            return this.f9735e;
        }

        public /* synthetic */ d(String str, Activity activity, String str2, String str3, boolean z, int i, OooOO0O oooOO0O) {
            this(str, activity, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z);
        }
    }

    /* renamed from: b */
    String mo10202b();

    /* renamed from: c */
    String mo10203c();

    /* renamed from: d */
    boolean mo10204d();
}
