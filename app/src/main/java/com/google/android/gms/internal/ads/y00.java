package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes2.dex */
public final class y00 implements InterfaceC2042sb {

    /* renamed from: OooOo */
    public final Object f25825OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f25826OooOo0O = 1;

    /* renamed from: OooOo0o */
    public final Object f25827OooOo0o;

    /* renamed from: OooOoO */
    public final /* synthetic */ Object f25828OooOoO;

    /* renamed from: OooOoO0 */
    public final Object f25829OooOoO0;

    public /* synthetic */ y00(InterfaceC1401ax interfaceC1401ax, C1468cr c1468cr, hg0 hg0Var, s50 s50Var) {
        this.f25827OooOo0o = interfaceC1401ax;
        this.f25825OooOo = c1468cr;
        this.f25829OooOoO0 = hg0Var;
        this.f25828OooOoO = s50Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2042sb
    public final void OooO0o0(Object obj, Map map) {
        switch (this.f25826OooOo0O) {
            case 0:
                Object obj2 = ((WeakReference) this.f25827OooOo0o).get();
                if (obj2 != null) {
                    ((InterfaceC2042sb) this.f25829OooOoO0).OooO0o0(obj2, map);
                    break;
                } else {
                    ((z00) this.f25828OooOoO).OooO0Oo((String) this.f25825OooOo, this);
                    break;
                }
            default:
                InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) obj;
                AbstractC2005rb.OooO0O0(map, (InterfaceC1401ax) this.f25827OooOo0o);
                String str = (String) map.get("u");
                if (str != null) {
                    o00000oO.OooOOO oooOOOOooO00o = AbstractC2005rb.OooO00o(interfaceC1722jo, str);
                    C1386ai c1386ai = new C1386ai(interfaceC1722jo, (C1468cr) this.f25825OooOo, (hg0) this.f25829OooOoO0, (s50) this.f25828OooOoO, 14);
                    oooOOOOooO00o.addListener(new wp0(0, oooOOOOooO00o, c1386ai), AbstractC2200wl.f25321OooO00o);
                    break;
                } else {
                    zzo.zzj("URL missing from click GMSG.");
                    break;
                }
        }
    }

    public /* synthetic */ y00(z00 z00Var, WeakReference weakReference, String str, InterfaceC2042sb interfaceC2042sb) {
        this.f25828OooOoO = z00Var;
        this.f25827OooOo0o = weakReference;
        this.f25825OooOo = str;
        this.f25829OooOoO0 = interfaceC2042sb;
    }
}
