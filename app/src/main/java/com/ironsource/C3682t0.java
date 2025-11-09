package com.ironsource;

import com.ironsource.mediationsdk.C3368d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ironsource.t0 */
/* loaded from: classes2.dex */
public class C3682t0 {

    /* renamed from: q */
    public static final a f11973q = new a(null);

    /* renamed from: r */
    public static final int f11974r = -1;

    /* renamed from: a */
    private final IronSource.AD_UNIT f11975a;

    /* renamed from: b */
    private final String f11976b;

    /* renamed from: c */
    private final List<NetworkSettings> f11977c;

    /* renamed from: d */
    private final C3477o5 f11978d;

    /* renamed from: e */
    private int f11979e;

    /* renamed from: f */
    private final int f11980f;

    /* renamed from: g */
    private boolean f11981g;

    /* renamed from: h */
    private final int f11982h;

    /* renamed from: i */
    private final int f11983i;

    /* renamed from: j */
    private final C3350m2 f11984j;

    /* renamed from: k */
    private final C3137g2 f11985k;

    /* renamed from: l */
    private final long f11986l;

    /* renamed from: m */
    private final boolean f11987m;

    /* renamed from: n */
    private final boolean f11988n;

    /* renamed from: o */
    private final boolean f11989o;

    /* renamed from: p */
    private boolean f11990p;

    /* renamed from: com.ironsource.t0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3682t0(IronSource.AD_UNIT adUnit, String str, List<? extends NetworkSettings> list, C3477o5 auctionSettings, int i, int i2, boolean z, int i3, int i4, C3350m2 loadingData, C3137g2 interactionData, long j, boolean z2, boolean z3, boolean z4, boolean z5) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionSettings, "auctionSettings");
        kotlin.jvm.internal.OooOo.OooO0o0(loadingData, "loadingData");
        kotlin.jvm.internal.OooOo.OooO0o0(interactionData, "interactionData");
        this.f11975a = adUnit;
        this.f11976b = str;
        this.f11977c = list;
        this.f11978d = auctionSettings;
        this.f11979e = i;
        this.f11980f = i2;
        this.f11981g = z;
        this.f11982h = i3;
        this.f11983i = i4;
        this.f11984j = loadingData;
        this.f11985k = interactionData;
        this.f11986l = j;
        this.f11987m = z2;
        this.f11988n = z3;
        this.f11989o = z4;
        this.f11990p = z5;
    }

    /* renamed from: a */
    public final int m12329a() {
        return this.f11983i;
    }

    /* renamed from: b */
    public final IronSource.AD_UNIT m12333b() {
        return this.f11975a;
    }

    /* renamed from: c */
    public final boolean m12335c() {
        return this.f11981g;
    }

    /* renamed from: d */
    public final C3477o5 m12336d() {
        return this.f11978d;
    }

    /* renamed from: e */
    public final long m12337e() {
        return this.f11986l;
    }

    /* renamed from: f */
    public final int m12338f() {
        return this.f11982h;
    }

    /* renamed from: g */
    public final C3137g2 m12339g() {
        return this.f11985k;
    }

    /* renamed from: h */
    public final C3350m2 m12340h() {
        return this.f11984j;
    }

    /* renamed from: i */
    public final int m12341i() {
        return this.f11979e;
    }

    /* renamed from: j */
    public List<NetworkSettings> mo8379j() {
        return this.f11977c;
    }

    /* renamed from: k */
    public final boolean m12342k() {
        return this.f11987m;
    }

    /* renamed from: l */
    public final boolean m12343l() {
        return this.f11989o;
    }

    /* renamed from: m */
    public final boolean m12344m() {
        return this.f11990p;
    }

    /* renamed from: n */
    public final int m12345n() {
        return this.f11980f;
    }

    /* renamed from: o */
    public String mo8380o() {
        return this.f11976b;
    }

    /* renamed from: p */
    public final boolean m12346p() {
        return this.f11988n;
    }

    /* renamed from: q */
    public final boolean m12347q() {
        return this.f11978d.m11094g() > 0;
    }

    /* renamed from: r */
    public final String m12348r() {
        return String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", C3368d.f9626x, Integer.valueOf(this.f11979e), C3368d.f9627y, Boolean.valueOf(this.f11981g), C3368d.f9628z, Boolean.valueOf(this.f11990p));
    }

    public /* synthetic */ C3682t0(IronSource.AD_UNIT ad_unit, String str, List list, C3477o5 c3477o5, int i, int i2, boolean z, int i3, int i4, C3350m2 c3350m2, C3137g2 c3137g2, long j, boolean z2, boolean z3, boolean z4, boolean z5, int i5, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(ad_unit, str, list, c3477o5, i, i2, z, i3, i4, c3350m2, c3137g2, j, z2, z3, z4, (i5 & 32768) != 0 ? false : z5);
    }

    /* renamed from: a */
    public final NetworkSettings m12330a(String instanceName) {
        kotlin.jvm.internal.OooOo.OooO0o0(instanceName, "instanceName");
        List<NetworkSettings> listMo8379j = mo8379j();
        Object obj = null;
        if (listMo8379j == null) {
            return null;
        }
        Iterator<T> it = listMo8379j.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((NetworkSettings) next).getProviderInstanceName().equals(instanceName)) {
                obj = next;
                break;
            }
        }
        return (NetworkSettings) obj;
    }

    /* renamed from: b */
    public final void m12334b(boolean z) {
        this.f11990p = z;
    }

    /* renamed from: a */
    public final void m12331a(int i) {
        this.f11979e = i;
    }

    /* renamed from: a */
    public final void m12332a(boolean z) {
        this.f11981g = z;
    }
}
