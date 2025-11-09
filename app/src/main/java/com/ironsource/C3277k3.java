package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ironsourceads.AdSize;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.k3 */
/* loaded from: classes2.dex */
public final class C3277k3 {

    /* renamed from: a */
    public static final C3277k3 f9201a = new C3277k3();

    /* renamed from: com.ironsource.k3$a */
    public static final class a implements InterfaceC3312l3 {

        /* renamed from: a */
        private final IronSource.AD_UNIT f9202a;

        public a(IronSource.AD_UNIT value) {
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            this.f9202a = value;
        }

        /* renamed from: a */
        public static /* synthetic */ a m9573a(a aVar, IronSource.AD_UNIT ad_unit, int i, Object obj) {
            if ((i & 1) != 0) {
                ad_unit = aVar.f9202a;
            }
            return aVar.m9575a(ad_unit);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f9202a == ((a) obj).f9202a;
        }

        public int hashCode() {
            return this.f9202a.hashCode();
        }

        public String toString() {
            return "AdFormatEntity(value=" + this.f9202a + ')';
        }

        /* renamed from: a */
        public final a m9575a(IronSource.AD_UNIT value) {
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            return new a(value);
        }

        /* renamed from: a */
        private final IronSource.AD_UNIT m9574a() {
            return this.f9202a;
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            bundle.put("adUnit", Integer.valueOf(C2951av.m7846b(this.f9202a)));
        }
    }

    /* renamed from: com.ironsource.k3$b */
    public static final class b implements InterfaceC3312l3 {

        /* renamed from: a */
        private final String f9203a;

        public b(String value) {
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            this.f9203a = value;
        }

        /* renamed from: a */
        public static /* synthetic */ b m9577a(b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f9203a;
            }
            return bVar.m9579a(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.OooOo.OooO00o(this.f9203a, ((b) obj).f9203a);
        }

        public int hashCode() {
            return this.f9203a.hashCode();
        }

        public String toString() {
            return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f9203a, new StringBuilder("AdIdentifier(value="));
        }

        /* renamed from: a */
        public final b m9579a(String value) {
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            return new b(value);
        }

        /* renamed from: a */
        private final String m9578a() {
            return this.f9203a;
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_IRONSOURCE_AD_OBJECT_ID, this.f9203a);
        }
    }

    /* renamed from: com.ironsource.k3$c */
    public static final class c implements InterfaceC3312l3 {

        /* renamed from: a */
        private final AdSize f9204a;

        public c(AdSize size) {
            kotlin.jvm.internal.OooOo.OooO0o0(size, "size");
            this.f9204a = size;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo9576a(java.util.Map<java.lang.String, java.lang.Object> r4) {
            /*
                r3 = this;
                java.lang.String r0 = "bundle"
                kotlin.jvm.internal.OooOo.OooO0o0(r4, r0)
                com.unity3d.ironsourceads.AdSize r0 = r3.f9204a
                java.lang.String r0 = r0.getSizeDescription()
                int r1 = r0.hashCode()
                r2 = -96588539(0xfffffffffa3e2d05, float:-2.4686238E35)
                if (r1 == r2) goto L45
                r2 = 72205083(0x44dc31b, float:2.4187222E-36)
                if (r1 == r2) goto L3a
                r2 = 446888797(0x1aa2fb5d, float:6.740773E-23)
                if (r1 == r2) goto L2f
                r2 = 1951953708(0x7458732c, float:6.859571E31)
                if (r1 == r2) goto L24
                goto L4d
            L24:
                java.lang.String r1 = "BANNER"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L2d
                goto L4d
            L2d:
                r0 = 1
                goto L50
            L2f:
                java.lang.String r1 = "LEADERBOARD"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L38
                goto L4d
            L38:
                r0 = 4
                goto L50
            L3a:
                java.lang.String r1 = "LARGE"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L43
                goto L4d
            L43:
                r0 = 2
                goto L50
            L45:
                java.lang.String r1 = "MEDIUM_RECTANGLE"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L4f
            L4d:
                r0 = 0
                goto L50
            L4f:
                r0 = 3
            L50:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.String r1 = "bannerAdSize"
                r4.put(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3277k3.c.mo9576a(java.util.Map):void");
        }
    }

    /* renamed from: com.ironsource.k3$d */
    public static final class d implements InterfaceC3312l3 {

        /* renamed from: a */
        private final String f9205a;

        public d(String auctionId) {
            kotlin.jvm.internal.OooOo.OooO0o0(auctionId, "auctionId");
            this.f9205a = auctionId;
        }

        /* renamed from: a */
        public static /* synthetic */ d m9580a(d dVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.f9205a;
            }
            return dVar.m9582a(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.OooOo.OooO00o(this.f9205a, ((d) obj).f9205a);
        }

        public int hashCode() {
            return this.f9205a.hashCode();
        }

        public String toString() {
            return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f9205a, new StringBuilder("AuctionId(auctionId="));
        }

        /* renamed from: a */
        public final d m9582a(String auctionId) {
            kotlin.jvm.internal.OooOo.OooO0o0(auctionId, "auctionId");
            return new d(auctionId);
        }

        /* renamed from: a */
        private final String m9581a() {
            return this.f9205a;
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            bundle.put("auctionId", this.f9205a);
        }
    }

    /* renamed from: com.ironsource.k3$e */
    public static final class e implements InterfaceC3312l3 {

        /* renamed from: a */
        private final int f9206a;

        public e(int i) {
            this.f9206a = i;
        }

        /* renamed from: a */
        private final int m9583a() {
            return this.f9206a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f9206a == ((e) obj).f9206a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f9206a);
        }

        public String toString() {
            return OooO0oO.OooOo.OooOOO0(new StringBuilder("DemandOnly(value="), this.f9206a, ')');
        }

        /* renamed from: a */
        public final e m9585a(int i) {
            return new e(i);
        }

        /* renamed from: a */
        public static /* synthetic */ e m9584a(e eVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = eVar.f9206a;
            }
            return eVar.m9585a(i);
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_DEMAND_ONLY, Integer.valueOf(this.f9206a));
        }
    }

    /* renamed from: com.ironsource.k3$f */
    public static final class f implements InterfaceC3312l3 {

        /* renamed from: a */
        private final long f9207a;

        public f(long j) {
            this.f9207a = j;
        }

        /* renamed from: a */
        private final long m9586a() {
            return this.f9207a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f9207a == ((f) obj).f9207a;
        }

        public int hashCode() {
            return Long.hashCode(this.f9207a);
        }

        public String toString() {
            return "Duration(duration=" + this.f9207a + ')';
        }

        /* renamed from: a */
        public final f m9588a(long j) {
            return new f(j);
        }

        /* renamed from: a */
        public static /* synthetic */ f m9587a(f fVar, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = fVar.f9207a;
            }
            return fVar.m9588a(j);
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.f9207a));
        }
    }

    /* renamed from: com.ironsource.k3$g */
    public static final class g implements InterfaceC3312l3 {

        /* renamed from: a */
        private final String f9208a;

        public g(String dynamicSourceId) {
            kotlin.jvm.internal.OooOo.OooO0o0(dynamicSourceId, "dynamicSourceId");
            this.f9208a = dynamicSourceId;
        }

        /* renamed from: a */
        public static /* synthetic */ g m9589a(g gVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gVar.f9208a;
            }
            return gVar.m9591a(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && kotlin.jvm.internal.OooOo.OooO00o(this.f9208a, ((g) obj).f9208a);
        }

        public int hashCode() {
            return this.f9208a.hashCode();
        }

        public String toString() {
            return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f9208a, new StringBuilder("DynamicDemandSourceId(dynamicSourceId="));
        }

        /* renamed from: a */
        public final g m9591a(String dynamicSourceId) {
            kotlin.jvm.internal.OooOo.OooO0o0(dynamicSourceId, "dynamicSourceId");
            return new g(dynamicSourceId);
        }

        /* renamed from: a */
        private final String m9590a() {
            return this.f9208a;
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f9208a);
        }
    }

    /* renamed from: com.ironsource.k3$h */
    public static final class h implements InterfaceC3312l3 {

        /* renamed from: a */
        private final String f9209a;

        public h(String sourceId) {
            kotlin.jvm.internal.OooOo.OooO0o0(sourceId, "sourceId");
            this.f9209a = sourceId;
        }

        /* renamed from: a */
        public static /* synthetic */ h m9592a(h hVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hVar.f9209a;
            }
            return hVar.m9594a(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && kotlin.jvm.internal.OooOo.OooO00o(this.f9209a, ((h) obj).f9209a);
        }

        public int hashCode() {
            return this.f9209a.hashCode();
        }

        public String toString() {
            return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f9209a, new StringBuilder("DynamicSourceId(sourceId="));
        }

        /* renamed from: a */
        public final h m9594a(String sourceId) {
            kotlin.jvm.internal.OooOo.OooO0o0(sourceId, "sourceId");
            return new h(sourceId);
        }

        /* renamed from: a */
        private final String m9593a() {
            return this.f9209a;
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f9209a);
        }
    }

    /* renamed from: com.ironsource.k3$i */
    public static final class i implements InterfaceC3312l3 {

        /* renamed from: a */
        public static final i f9210a = new i();

        private i() {
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
        }
    }

    /* renamed from: com.ironsource.k3$j */
    public static final class j implements InterfaceC3312l3 {

        /* renamed from: a */
        private final int f9211a;

        public j(int i) {
            this.f9211a = i;
        }

        /* renamed from: a */
        private final int m9595a() {
            return this.f9211a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f9211a == ((j) obj).f9211a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f9211a);
        }

        public String toString() {
            return OooO0oO.OooOo.OooOOO0(new StringBuilder("ErrorCode(code="), this.f9211a, ')');
        }

        /* renamed from: a */
        public final j m9597a(int i) {
            return new j(i);
        }

        /* renamed from: a */
        public static /* synthetic */ j m9596a(j jVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = jVar.f9211a;
            }
            return jVar.m9597a(i);
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(this.f9211a));
        }
    }

    /* renamed from: com.ironsource.k3$k */
    public static final class k implements InterfaceC3312l3 {

        /* renamed from: a */
        private final String f9212a;

        public k(String str) {
            this.f9212a = str;
        }

        /* renamed from: a */
        public static /* synthetic */ k m9598a(k kVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = kVar.f9212a;
            }
            return kVar.m9600a(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && kotlin.jvm.internal.OooOo.OooO00o(this.f9212a, ((k) obj).f9212a);
        }

        public int hashCode() {
            String str = this.f9212a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f9212a, new StringBuilder("ErrorReason(reason="));
        }

        /* renamed from: a */
        public final k m9600a(String str) {
            return new k(str);
        }

        /* renamed from: a */
        private final String m9599a() {
            return this.f9212a;
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            String str = this.f9212a;
            if (str == null || str.length() == 0) {
                return;
            }
            bundle.put("reason", this.f9212a);
        }
    }

    /* renamed from: com.ironsource.k3$l */
    public static final class l implements InterfaceC3312l3 {

        /* renamed from: a */
        private final String f9213a;

        public l(String value) {
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            this.f9213a = value;
        }

        /* renamed from: a */
        public static /* synthetic */ l m9601a(l lVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = lVar.f9213a;
            }
            return lVar.m9603a(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && kotlin.jvm.internal.OooOo.OooO00o(this.f9213a, ((l) obj).f9213a);
        }

        public int hashCode() {
            return this.f9213a.hashCode();
        }

        public String toString() {
            return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f9213a, new StringBuilder("Ext1(value="));
        }

        /* renamed from: a */
        public final l m9603a(String value) {
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            return new l(value);
        }

        /* renamed from: a */
        private final String m9602a() {
            return this.f9213a;
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_EXT1, this.f9213a);
        }
    }

    /* renamed from: com.ironsource.k3$m */
    public static final class m implements InterfaceC3312l3 {

        /* renamed from: a */
        private final JSONObject f9214a;

        public m(JSONObject jSONObject) {
            this.f9214a = jSONObject;
        }

        /* renamed from: a */
        public static /* synthetic */ m m9604a(m mVar, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                jSONObject = mVar.f9214a;
            }
            return mVar.m9606a(jSONObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && kotlin.jvm.internal.OooOo.OooO00o(this.f9214a, ((m) obj).f9214a);
        }

        public int hashCode() {
            JSONObject jSONObject = this.f9214a;
            if (jSONObject == null) {
                return 0;
            }
            return jSONObject.hashCode();
        }

        public String toString() {
            return "GenericParams(genericParams=" + this.f9214a + ')';
        }

        /* renamed from: a */
        public final m m9606a(JSONObject jSONObject) {
            return new m(jSONObject);
        }

        /* renamed from: a */
        private final JSONObject m9605a() {
            return this.f9214a;
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            JSONObject jSONObject = this.f9214a;
            if (jSONObject == null) {
                return;
            }
            bundle.put("genericParams", jSONObject);
        }
    }

    /* renamed from: com.ironsource.k3$n */
    public static final class n implements InterfaceC3312l3 {

        /* renamed from: a */
        private final int f9215a;

        public n(int i) {
            this.f9215a = i;
        }

        /* renamed from: a */
        private final int m9607a() {
            return this.f9215a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f9215a == ((n) obj).f9215a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f9215a);
        }

        public String toString() {
            return OooO0oO.OooOo.OooOOO0(new StringBuilder("InstanceType(instanceType="), this.f9215a, ')');
        }

        /* renamed from: a */
        public final n m9609a(int i) {
            return new n(i);
        }

        /* renamed from: a */
        public static /* synthetic */ n m9608a(n nVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = nVar.f9215a;
            }
            return nVar.m9609a(i);
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            bundle.put("instanceType", Integer.valueOf(this.f9215a));
        }
    }

    /* renamed from: com.ironsource.k3$o */
    public static final class o implements InterfaceC3312l3 {

        /* renamed from: a */
        private final int f9216a;

        public o(int i) {
            this.f9216a = i;
        }

        /* renamed from: a */
        private final int m9610a() {
            return this.f9216a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f9216a == ((o) obj).f9216a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f9216a);
        }

        public String toString() {
            return OooO0oO.OooOo.OooOOO0(new StringBuilder("MultipleAdObjects(value="), this.f9216a, ')');
        }

        /* renamed from: a */
        public final o m9612a(int i) {
            return new o(i);
        }

        /* renamed from: a */
        public static /* synthetic */ o m9611a(o oVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = oVar.f9216a;
            }
            return oVar.m9612a(i);
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            bundle.put("isMultipleAdObjects", Integer.valueOf(this.f9216a));
        }
    }

    /* renamed from: com.ironsource.k3$p */
    public static final class p implements InterfaceC3312l3 {

        /* renamed from: a */
        private final int f9217a;

        public p(int i) {
            this.f9217a = i;
        }

        /* renamed from: a */
        private final int m9613a() {
            return this.f9217a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f9217a == ((p) obj).f9217a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f9217a);
        }

        public String toString() {
            return OooO0oO.OooOo.OooOOO0(new StringBuilder("OneFlow(value="), this.f9217a, ')');
        }

        /* renamed from: a */
        public final p m9615a(int i) {
            return new p(i);
        }

        /* renamed from: a */
        public static /* synthetic */ p m9614a(p pVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pVar.f9217a;
            }
            return pVar.m9615a(i);
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            bundle.put("isOneFlow", Integer.valueOf(this.f9217a));
        }
    }

    /* renamed from: com.ironsource.k3$q */
    public static final class q implements InterfaceC3312l3 {

        /* renamed from: a */
        private final String f9218a;

        public q(String value) {
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            this.f9218a = value;
        }

        /* renamed from: a */
        public static /* synthetic */ q m9616a(q qVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = qVar.f9218a;
            }
            return qVar.m9618a(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && kotlin.jvm.internal.OooOo.OooO00o(this.f9218a, ((q) obj).f9218a);
        }

        public int hashCode() {
            return this.f9218a.hashCode();
        }

        public String toString() {
            return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f9218a, new StringBuilder("Placement(value="));
        }

        /* renamed from: a */
        public final q m9618a(String value) {
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            return new q(value);
        }

        /* renamed from: a */
        private final String m9617a() {
            return this.f9218a;
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            bundle.put("placement", this.f9218a);
        }
    }

    /* renamed from: com.ironsource.k3$r */
    public static final class r implements InterfaceC3312l3 {

        /* renamed from: a */
        private final int f9219a;

        public r(int i) {
            this.f9219a = i;
        }

        /* renamed from: a */
        private final int m9619a() {
            return this.f9219a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f9219a == ((r) obj).f9219a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f9219a);
        }

        public String toString() {
            return OooO0oO.OooOo.OooOOO0(new StringBuilder("Programmatic(programmatic="), this.f9219a, ')');
        }

        /* renamed from: a */
        public final r m9621a(int i) {
            return new r(i);
        }

        /* renamed from: a */
        public static /* synthetic */ r m9620a(r rVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = rVar.f9219a;
            }
            return rVar.m9621a(i);
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.f9219a));
        }
    }

    /* renamed from: com.ironsource.k3$s */
    public static final class s implements InterfaceC3312l3 {

        /* renamed from: a */
        private final String f9220a;

        public s(String sourceName) {
            kotlin.jvm.internal.OooOo.OooO0o0(sourceName, "sourceName");
            this.f9220a = sourceName;
        }

        /* renamed from: a */
        public static /* synthetic */ s m9622a(s sVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sVar.f9220a;
            }
            return sVar.m9624a(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && kotlin.jvm.internal.OooOo.OooO00o(this.f9220a, ((s) obj).f9220a);
        }

        public int hashCode() {
            return this.f9220a.hashCode();
        }

        public String toString() {
            return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f9220a, new StringBuilder("Provider(sourceName="));
        }

        /* renamed from: a */
        public final s m9624a(String sourceName) {
            kotlin.jvm.internal.OooOo.OooO0o0(sourceName, "sourceName");
            return new s(sourceName);
        }

        /* renamed from: a */
        private final String m9623a() {
            return this.f9220a;
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER, this.f9220a);
        }
    }

    /* renamed from: com.ironsource.k3$t */
    public static final class t implements InterfaceC3312l3 {

        /* renamed from: a */
        private final int f9221a;

        public t(int i) {
            this.f9221a = i;
        }

        /* renamed from: a */
        private final int m9625a() {
            return this.f9221a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.f9221a == ((t) obj).f9221a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f9221a);
        }

        public String toString() {
            return OooO0oO.OooOo.OooOOO0(new StringBuilder("RewardAmount(value="), this.f9221a, ')');
        }

        /* renamed from: a */
        public final t m9627a(int i) {
            return new t(i);
        }

        /* renamed from: a */
        public static /* synthetic */ t m9626a(t tVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = tVar.f9221a;
            }
            return tVar.m9627a(i);
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f9221a));
        }
    }

    /* renamed from: com.ironsource.k3$u */
    public static final class u implements InterfaceC3312l3 {

        /* renamed from: a */
        private final String f9222a;

        public u(String value) {
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            this.f9222a = value;
        }

        /* renamed from: a */
        public static /* synthetic */ u m9628a(u uVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uVar.f9222a;
            }
            return uVar.m9630a(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && kotlin.jvm.internal.OooOo.OooO00o(this.f9222a, ((u) obj).f9222a);
        }

        public int hashCode() {
            return this.f9222a.hashCode();
        }

        public String toString() {
            return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f9222a, new StringBuilder("RewardName(value="));
        }

        /* renamed from: a */
        public final u m9630a(String value) {
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            return new u(value);
        }

        /* renamed from: a */
        private final String m9629a() {
            return this.f9222a;
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f9222a);
        }
    }

    /* renamed from: com.ironsource.k3$v */
    public static final class v implements InterfaceC3312l3 {

        /* renamed from: a */
        private final String f9223a;

        public v(String version) {
            kotlin.jvm.internal.OooOo.OooO0o0(version, "version");
            this.f9223a = version;
        }

        /* renamed from: a */
        public static /* synthetic */ v m9631a(v vVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = vVar.f9223a;
            }
            return vVar.m9633a(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && kotlin.jvm.internal.OooOo.OooO00o(this.f9223a, ((v) obj).f9223a);
        }

        public int hashCode() {
            return this.f9223a.hashCode();
        }

        public String toString() {
            return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f9223a, new StringBuilder("SdkVersion(version="));
        }

        /* renamed from: a */
        public final v m9633a(String version) {
            kotlin.jvm.internal.OooOo.OooO0o0(version, "version");
            return new v(version);
        }

        /* renamed from: a */
        private final String m9632a() {
            return this.f9223a;
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, this.f9223a);
        }
    }

    /* renamed from: com.ironsource.k3$w */
    public static final class w implements InterfaceC3312l3 {

        /* renamed from: a */
        private final int f9224a;

        public w(int i) {
            this.f9224a = i;
        }

        /* renamed from: a */
        private final int m9634a() {
            return this.f9224a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f9224a == ((w) obj).f9224a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f9224a);
        }

        public String toString() {
            return OooO0oO.OooOo.OooOOO0(new StringBuilder("SessionDepth(sessionDepth="), this.f9224a, ')');
        }

        /* renamed from: a */
        public final w m9636a(int i) {
            return new w(i);
        }

        /* renamed from: a */
        public static /* synthetic */ w m9635a(w wVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = wVar.f9224a;
            }
            return wVar.m9636a(i);
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            bundle.put("sessionDepth", Integer.valueOf(this.f9224a));
        }
    }

    /* renamed from: com.ironsource.k3$x */
    public static final class x implements InterfaceC3312l3 {

        /* renamed from: a */
        private final String f9225a;

        public x(String subProviderId) {
            kotlin.jvm.internal.OooOo.OooO0o0(subProviderId, "subProviderId");
            this.f9225a = subProviderId;
        }

        /* renamed from: a */
        public static /* synthetic */ x m9637a(x xVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = xVar.f9225a;
            }
            return xVar.m9639a(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && kotlin.jvm.internal.OooOo.OooO00o(this.f9225a, ((x) obj).f9225a);
        }

        public int hashCode() {
            return this.f9225a.hashCode();
        }

        public String toString() {
            return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f9225a, new StringBuilder("SubProviderId(subProviderId="));
        }

        /* renamed from: a */
        public final x m9639a(String subProviderId) {
            kotlin.jvm.internal.OooOo.OooO0o0(subProviderId, "subProviderId");
            return new x(subProviderId);
        }

        /* renamed from: a */
        private final String m9638a() {
            return this.f9225a;
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            bundle.put("spId", this.f9225a);
        }
    }

    /* renamed from: com.ironsource.k3$y */
    public static final class y implements InterfaceC3312l3 {

        /* renamed from: a */
        private final String f9226a;

        public y(String value) {
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            this.f9226a = value;
        }

        /* renamed from: a */
        public static /* synthetic */ y m9640a(y yVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = yVar.f9226a;
            }
            return yVar.m9642a(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && kotlin.jvm.internal.OooOo.OooO00o(this.f9226a, ((y) obj).f9226a);
        }

        public int hashCode() {
            return this.f9226a.hashCode();
        }

        public String toString() {
            return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f9226a, new StringBuilder("TransId(value="));
        }

        /* renamed from: a */
        public final y m9642a(String value) {
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            return new y(value);
        }

        /* renamed from: a */
        private final String m9641a() {
            return this.f9226a;
        }

        @Override // com.ironsource.InterfaceC3312l3
        /* renamed from: a */
        public void mo9576a(Map<String, Object> bundle) {
            kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_TRANS_ID, this.f9226a);
        }
    }

    private C3277k3() {
    }
}
