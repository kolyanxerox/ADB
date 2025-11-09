package com.ironsource;

/* renamed from: com.ironsource.i7 */
/* loaded from: classes2.dex */
public abstract class AbstractC3212i7 {

    /* renamed from: c */
    public static final a f8990c = new a(null);

    /* renamed from: a */
    private final b f8991a;

    /* renamed from: b */
    private final C3245j6 f8992b;

    /* renamed from: com.ironsource.i7$a */
    public static final class a {

        /* renamed from: com.ironsource.i7$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C4576a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f8993a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.TIMED_LOAD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.TIMED_SHOW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f8993a = iArr;
            }
        }

        private a() {
        }

        /* renamed from: a */
        public final AbstractC3212i7 m9283a(C3349m1 adTools, C3792w6 bannerContainer, b config, C3245j6 bannerAdProperties, InterfaceC3316l7 bannerStrategyListener, InterfaceC3443n6 createBannerAdUnitFactory) {
            kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
            kotlin.jvm.internal.OooOo.OooO0o0(bannerContainer, "bannerContainer");
            kotlin.jvm.internal.OooOo.OooO0o0(config, "config");
            kotlin.jvm.internal.OooOo.OooO0o0(bannerAdProperties, "bannerAdProperties");
            kotlin.jvm.internal.OooOo.OooO0o0(bannerStrategyListener, "bannerStrategyListener");
            kotlin.jvm.internal.OooOo.OooO0o0(createBannerAdUnitFactory, "createBannerAdUnitFactory");
            int i = C4576a.f8993a[config.m9290e().ordinal()];
            if (i == 1) {
                return new C2987bw(adTools, bannerContainer, config, bannerAdProperties, bannerStrategyListener, createBannerAdUnitFactory);
            }
            if (i == 2) {
                return new C3022cw(adTools, bannerContainer, config, bannerAdProperties, bannerStrategyListener, createBannerAdUnitFactory);
            }
            throw new OooOOO0.OooO00o();
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    /* renamed from: com.ironsource.i7$b */
    public static final class b {

        /* renamed from: a */
        private final c f8994a;

        /* renamed from: b */
        private final long f8995b;

        /* renamed from: c */
        private final boolean f8996c;

        public b(c strategyType, long j, boolean z) {
            kotlin.jvm.internal.OooOo.OooO0o0(strategyType, "strategyType");
            this.f8994a = strategyType;
            this.f8995b = j;
            this.f8996c = z;
        }

        /* renamed from: a */
        public static /* synthetic */ b m9284a(b bVar, c cVar, long j, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = bVar.f8994a;
            }
            if ((i & 2) != 0) {
                j = bVar.f8995b;
            }
            if ((i & 4) != 0) {
                z = bVar.f8996c;
            }
            return bVar.m9285a(cVar, j, z);
        }

        /* renamed from: b */
        public final long m9287b() {
            return this.f8995b;
        }

        /* renamed from: c */
        public final boolean m9288c() {
            return this.f8996c;
        }

        /* renamed from: d */
        public final long m9289d() {
            return this.f8995b;
        }

        /* renamed from: e */
        public final c m9290e() {
            return this.f8994a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f8994a == bVar.f8994a && this.f8995b == bVar.f8995b && this.f8996c == bVar.f8996c;
        }

        /* renamed from: f */
        public final boolean m9291f() {
            return this.f8996c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = (Long.hashCode(this.f8995b) + (this.f8994a.hashCode() * 31)) * 31;
            boolean z = this.f8996c;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return iHashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Config(strategyType=");
            sb.append(this.f8994a);
            sb.append(", refreshInterval=");
            sb.append(this.f8995b);
            sb.append(", isAutoRefreshEnabled=");
            return androidx.datastore.preferences.protobuf.OooO00o.OooOOOO(sb, this.f8996c, ')');
        }

        /* renamed from: a */
        public final b m9285a(c strategyType, long j, boolean z) {
            kotlin.jvm.internal.OooOo.OooO0o0(strategyType, "strategyType");
            return new b(strategyType, j, z);
        }

        /* renamed from: a */
        public final c m9286a() {
            return this.f8994a;
        }
    }

    /* renamed from: com.ironsource.i7$c */
    public enum c {
        TIMED_LOAD,
        TIMED_SHOW
    }

    public AbstractC3212i7(b config, C3245j6 bannerAdProperties) {
        kotlin.jvm.internal.OooOo.OooO0o0(config, "config");
        kotlin.jvm.internal.OooOo.OooO0o0(bannerAdProperties, "bannerAdProperties");
        this.f8991a = config;
        this.f8992b = bannerAdProperties;
    }

    /* renamed from: c */
    public abstract void mo8046c();

    /* renamed from: d */
    public final boolean m9281d() {
        Boolean boolM9443i = this.f8992b.m9443i();
        return boolM9443i != null ? boolM9443i.booleanValue() : this.f8991a.m9291f();
    }

    /* renamed from: e */
    public abstract void mo8048e();

    /* renamed from: f */
    public abstract void mo8049f();

    /* renamed from: g */
    public abstract void mo8050g();

    /* renamed from: i */
    public final long m9282i() {
        Long lM9444j = this.f8992b.m9444j();
        return lM9444j != null ? lM9444j.longValue() : this.f8991a.m9289d();
    }
}
