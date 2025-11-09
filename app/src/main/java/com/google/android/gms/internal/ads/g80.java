package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* loaded from: classes2.dex */
public final class g80 implements InterfaceC2064sx {

    /* renamed from: OooOo */
    public final Object f19268OooOo;

    /* renamed from: OooOo0O */
    public boolean f19269OooOo0O;

    /* renamed from: OooOo0o */
    public final Object f19270OooOo0o;

    /* renamed from: OooOoO */
    public final Object f19271OooOoO;

    /* renamed from: OooOoO0 */
    public final Object f19272OooOoO0;

    /* renamed from: OooOoOO */
    public final Object f19273OooOoOO;

    /* renamed from: OooOoo */
    public final Object f19274OooOoo;

    /* renamed from: OooOoo0 */
    public final Object f19275OooOoo0;

    /* renamed from: OooOooO */
    public final Object f19276OooOooO;

    /* renamed from: OooOooo */
    public final Object f19277OooOooo;

    /* renamed from: Oooo000 */
    public Object f19278Oooo000;

    /* renamed from: Oooo00O */
    public Object f19279Oooo00O;

    public g80(Context context, n10 n10Var, vd0 vd0Var, VersionInfoParcel versionInfoParcel, kd0 kd0Var, C2274yl c2274yl, InterfaceC1722jo interfaceC1722jo, C2116ub c2116ub, boolean z, x50 x50Var, f20 f20Var, h20 h20Var) {
        this.f19270OooOo0o = context;
        this.f19268OooOo = n10Var;
        this.f19272OooOoO0 = vd0Var;
        this.f19271OooOoO = versionInfoParcel;
        this.f19273OooOoOO = kd0Var;
        this.f19275OooOoo0 = c2274yl;
        this.f19274OooOoo = interfaceC1722jo;
        this.f19276OooOooO = c2116ub;
        this.f19269OooOo0O = z;
        this.f19277OooOooo = x50Var;
        this.f19278Oooo000 = f20Var;
        this.f19279Oooo00O = h20Var;
    }

    public AbstractC1787lf OooO(List list, da1 da1Var) {
        ArrayList arrayList = (ArrayList) this.f19268OooOo;
        OooOOO(0, arrayList.size());
        return OooO0oO(arrayList.size(), list, da1Var);
    }

    public AbstractC1787lf OooO00o() {
        ArrayList arrayList = (ArrayList) this.f19268OooOo;
        if (arrayList.isEmpty()) {
            return AbstractC1787lf.f20867OooO00o;
        }
        int iOooO0OO = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            p51 p51Var = (p51) arrayList.get(i);
            p51Var.f23229OooO0Oo = iOooO0OO;
            iOooO0OO += p51Var.f23226OooO00o.f18213OooOOOO.f25266OooO0O0.OooO0OO();
        }
        return new x51(arrayList, (da1) this.f19279Oooo00O);
    }

    public AbstractC1787lf OooO0O0(int i, int i2, List list) {
        ArrayList arrayList = (ArrayList) this.f19268OooOo;
        af0.OoooO0(i >= 0 && i <= i2 && i2 <= arrayList.size());
        af0.OoooO0(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((p51) arrayList.get(i3)).f23226OooO00o.OooOOOo((C1550f) list.get(i3 - i));
        }
        return OooO00o();
    }

    public void OooO0OO(gb1 gb1Var) {
        af0.OooooO0(!this.f19269OooOo0O);
        this.f19278Oooo000 = gb1Var;
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f19268OooOo;
            if (i >= arrayList.size()) {
                this.f19269OooOo0O = true;
                return;
            }
            p51 p51Var = (p51) arrayList.get(i);
            OooOOO0(p51Var);
            ((HashSet) this.f19274OooOoo).add(p51Var);
            i++;
        }
    }

    public void OooO0Oo(g91 g91Var) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f19272OooOoO0;
        p51 p51Var = (p51) identityHashMap.remove(g91Var);
        p51Var.getClass();
        p51Var.f23226OooO00o.OooO00o(g91Var);
        p51Var.f23228OooO0OO.remove(((z81) g91Var).f26124OooOo0O);
        if (!identityHashMap.isEmpty()) {
            OooOO0O();
        }
        OooOO0o(p51Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2064sx
    public void OooO0o(boolean z, Context context, C2246xu c2246xu) {
        float f;
        InterfaceC1722jo interfaceC1722joOooO00o = (InterfaceC1722jo) this.f19274OooOoo;
        g10 g10Var = (g10) ii0.o00o0O((C2274yl) this.f19275OooOoo0);
        try {
            boolean zOooo0o0 = interfaceC1722joOooO00o.Oooo0o0();
            vd0 vd0Var = (vd0) this.f19272OooOoO0;
            kd0 kd0Var = (kd0) this.f19273OooOoOO;
            C2116ub c2116ub = (C2116ub) this.f19276OooOooO;
            boolean z2 = this.f19269OooOo0O;
            if (zOooo0o0) {
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17782o0000O)).booleanValue()) {
                    interfaceC1722joOooO00o = ((n10) this.f19268OooOo).OooO00o(vd0Var.f24956OooO0o0, null, null);
                    interfaceC1722joOooO00o.Oooo0OO("/reward", new C1709jb((C1547ex) ((C1540eq) g10Var).f18676OoooO0O.zzb(), 4));
                    C1658hx c1658hx = new C1658hx(3, (byte) 0);
                    ((m10) ((C1540eq) g10Var).f18673OoooO.zzb()).OooO00o(interfaceC1722joOooO00o, true, z2 ? c2116ub : null, ((f20) this.f19278Oooo000).f18768OooO0OO);
                    interfaceC1722joOooO00o.zzN().f21533OooOoo0 = new C1968qb(c1658hx, interfaceC1722joOooO00o);
                    interfaceC1722joOooO00o.zzN().f21532OooOoo = new p80(interfaceC1722joOooO00o, 22);
                    od0 od0Var = kd0Var.f20503OooOOoo;
                    interfaceC1722joOooO00o.OooOoo0(od0Var.f22974OooO0O0, od0Var.f22973OooO00o);
                }
            }
            InterfaceC1722jo interfaceC1722jo = interfaceC1722joOooO00o;
            interfaceC1722jo.o00O0O(true);
            boolean z3 = false;
            boolean zOooO00o = z2 ? c2116ub.OooO00o(false) : false;
            zzv.zzq();
            boolean zZzJ = zzs.zzJ((Context) this.f19270OooOo0o);
            if (z2) {
                synchronized (c2116ub) {
                    z3 = c2116ub.f24617OooO0O0;
                }
            }
            boolean z4 = z3;
            if (z2) {
                synchronized (c2116ub) {
                    f = c2116ub.f24618OooO0OO;
                }
            } else {
                f = 0.0f;
            }
            zzl zzlVar = new zzl(zOooO00o, zZzJ, z4, f, -1, z, kd0Var.f20525Oooo0oo, kd0Var.f20515Oooo);
            if (c2246xu != null) {
                c2246xu.zzf();
            }
            zzv.zzj();
            C1953px c1953px = (C1953px) ((C1540eq) g10Var).f18674OoooO0.zzb();
            int i = kd0Var.f20528OoooO00;
            od0 od0Var2 = kd0Var.f20503OooOOoo;
            String str = od0Var2.f22974OooO0O0;
            x50 x50Var = kd0Var.OooO0O0() ? (x50) this.f19277OooOooo : null;
            zzn.zza(context, new AdOverlayInfoParcel(null, c1953px, null, interfaceC1722jo, i, (VersionInfoParcel) this.f19271OooOoO, kd0Var.f20512OooOoo0, zzlVar, str, od0Var2.f22973OooO00o, vd0Var.f24955OooO0o, c2246xu, x50Var, interfaceC1722jo.zzr()), true, (h20) this.f19279Oooo00O);
        } catch (C2018ro e) {
            zzo.zzh("", e);
        }
    }

    public boolean OooO0o0() {
        return this.f19269OooOo0O;
    }

    public AbstractC1787lf OooO0oO(int i, List list, da1 da1Var) {
        if (!list.isEmpty()) {
            this.f19279Oooo00O = da1Var;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                p51 p51Var = (p51) list.get(i2 - i);
                ArrayList arrayList = (ArrayList) this.f19268OooOo;
                if (i2 > 0) {
                    p51 p51Var2 = (p51) arrayList.get(i2 - 1);
                    p51Var.f23229OooO0Oo = p51Var2.f23226OooO00o.f18213OooOOOO.f25266OooO0O0.OooO0OO() + p51Var2.f23229OooO0Oo;
                    p51Var.f23230OooO0o0 = false;
                    p51Var.f23228OooO0OO.clear();
                } else {
                    p51Var.f23229OooO0Oo = 0;
                    p51Var.f23230OooO0o0 = false;
                    p51Var.f23228OooO0OO.clear();
                }
                int iOooO0OO = p51Var.f23226OooO00o.f18213OooOOOO.f25266OooO0O0.OooO0OO();
                for (int i3 = i2; i3 < arrayList.size(); i3++) {
                    ((p51) arrayList.get(i3)).f23229OooO0Oo += iOooO0OO;
                }
                arrayList.add(i2, p51Var);
                ((HashMap) this.f19271OooOoO).put(p51Var.f23227OooO0O0, p51Var);
                if (this.f19269OooOo0O) {
                    OooOOO0(p51Var);
                    if (((IdentityHashMap) this.f19272OooOoO0).isEmpty()) {
                        ((HashSet) this.f19274OooOoo).add(p51Var);
                    } else {
                        o51 o51Var = (o51) ((HashMap) this.f19275OooOoo0).get(p51Var);
                        if (o51Var != null) {
                            o51Var.f22342OooO00o.OooO0o0(o51Var.f22343OooO0O0);
                        }
                    }
                }
            }
        }
        return OooO00o();
    }

    public AbstractC1787lf OooO0oo(int i, int i2, da1 da1Var) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= ((ArrayList) this.f19268OooOo).size()) {
            z = true;
        }
        af0.OoooO0(z);
        this.f19279Oooo00O = da1Var;
        OooOOO(i, i2);
        return OooO00o();
    }

    public AbstractC1787lf OooOO0(da1 da1Var) {
        int size = ((ArrayList) this.f19268OooOo).size();
        if (da1Var.f18222OooO0O0.length != size) {
            da1Var = new da1(new Random(da1Var.f18221OooO00o.nextLong())).OooO00o(size);
        }
        this.f19279Oooo00O = da1Var;
        return OooO00o();
    }

    public void OooOO0O() {
        Iterator it = ((HashSet) this.f19274OooOoo).iterator();
        while (it.hasNext()) {
            p51 p51Var = (p51) it.next();
            if (p51Var.f23228OooO0OO.isEmpty()) {
                o51 o51Var = (o51) ((HashMap) this.f19275OooOoo0).get(p51Var);
                if (o51Var != null) {
                    o51Var.f22342OooO00o.OooO0o0(o51Var.f22343OooO0O0);
                }
                it.remove();
            }
        }
    }

    public void OooOO0o(p51 p51Var) {
        if (p51Var.f23230OooO0o0 && p51Var.f23228OooO0OO.isEmpty()) {
            o51 o51Var = (o51) ((HashMap) this.f19275OooOoo0).remove(p51Var);
            o51Var.getClass();
            l51 l51Var = o51Var.f22343OooO0O0;
            n81 n81Var = o51Var.f22342OooO00o;
            n81Var.OooOO0o(l51Var);
            n51 n51Var = o51Var.f22344OooO0OO;
            n81Var.OooOOOO(n51Var);
            n81Var.OooOOO(n51Var);
            ((HashSet) this.f19274OooOoo).remove(p51Var);
        }
    }

    public void OooOOO(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            ArrayList arrayList = (ArrayList) this.f19268OooOo;
            p51 p51Var = (p51) arrayList.remove(i2);
            ((HashMap) this.f19271OooOoO).remove(p51Var.f23227OooO0O0);
            int i3 = -p51Var.f23226OooO00o.f18213OooOOOO.f25266OooO0O0.OooO0OO();
            for (int i4 = i2; i4 < arrayList.size(); i4++) {
                ((p51) arrayList.get(i4)).f23229OooO0Oo += i3;
            }
            p51Var.f23230OooO0o0 = true;
            if (this.f19269OooOo0O) {
                OooOO0o(p51Var);
            }
        }
    }

    public void OooOOO0(p51 p51Var) {
        d91 d91Var = p51Var.f23226OooO00o;
        l51 l51Var = new i91() { // from class: com.google.android.gms.internal.ads.l51
            public /* synthetic */ l51() {
            }

            @Override // com.google.android.gms.internal.ads.i91
            public final void OooO00o(n81 n81Var, AbstractC1787lf abstractC1787lf) {
                m60 m60Var = ((b51) this.f20807OooO00o.f19273OooOoOO).f17380OooOoo;
                m60Var.f21095OooO00o.removeMessages(2);
                m60Var.OooO0OO(22);
            }
        };
        n51 n51Var = new n51(this, p51Var);
        ((HashMap) this.f19275OooOoo0).put(p51Var, new o51(d91Var, l51Var, n51Var));
        int i = i80.f19994OooO00o;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        o71 o71Var = d91Var.f21438OooO0OO;
        o71Var.getClass();
        o71Var.f22355OooO0O0.add(new k91(handler, n51Var));
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        o71 o71Var2 = d91Var.f21439OooO0Oo;
        o71Var2.getClass();
        o71Var2.f22355OooO0O0.add(new n71(n51Var));
        d91Var.OooO(l51Var, (gb1) this.f19278Oooo000, (o61) this.f19270OooOo0o);
    }

    public g80(b51 b51Var, h61 h61Var, m60 m60Var, o61 o61Var) {
        this.f19270OooOo0o = o61Var;
        this.f19273OooOoOO = b51Var;
        this.f19279Oooo00O = new da1();
        this.f19272OooOoO0 = new IdentityHashMap();
        this.f19271OooOoO = new HashMap();
        this.f19268OooOo = new ArrayList();
        this.f19276OooOooO = h61Var;
        this.f19277OooOooo = m60Var;
        this.f19275OooOoo0 = new HashMap();
        this.f19274OooOoo = new HashSet();
    }
}
