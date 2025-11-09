package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C2051sk;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class Oooo000 extends OooOOO0 {

    /* renamed from: OooOo */
    public final ArrayList f26437OooOo;

    /* renamed from: OooOoO */
    public final C2051sk f26438OooOoO;

    /* renamed from: OooOoO0 */
    public final ArrayList f26439OooOoO0;

    public Oooo000(Oooo000 oooo000) {
        super(oooo000.f26427OooOo0O);
        ArrayList arrayList = new ArrayList(oooo000.f26437OooOo.size());
        this.f26437OooOo = arrayList;
        arrayList.addAll(oooo000.f26437OooOo);
        ArrayList arrayList2 = new ArrayList(oooo000.f26439OooOoO0.size());
        this.f26439OooOoO0 = arrayList2;
        arrayList2.addAll(oooo000.f26439OooOoO0);
        this.f26438OooOoO = oooo000.f26438OooOoO;
    }

    @Override // com.google.android.gms.internal.measurement.OooOOO0
    public final Oooo0 OooO00o(C2051sk c2051sk, List list) {
        o00Oo0 o00oo0;
        C2051sk c2051skOooOOOo = this.f26438OooOoO.OooOOOo();
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f26437OooOo;
            int size = arrayList.size();
            o00oo0 = Oooo0.OooOO0o;
            if (i2 >= size) {
                break;
            }
            if (i2 < list.size()) {
                c2051skOooOOOo.OooOoOO((String) arrayList.get(i2), ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) list.get(i2)));
            } else {
                c2051skOooOOOo.OooOoOO((String) arrayList.get(i2), o00oo0);
            }
            i2++;
        }
        ArrayList arrayList2 = this.f26439OooOoO0;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            Oooo0 oooo0 = (Oooo0) obj;
            oo000o oo000oVar = (oo000o) c2051skOooOOOo.f24096OooOo;
            Oooo0 oooo0OooO0OO = oo000oVar.OooO0OO(c2051skOooOOOo, oooo0);
            if (oooo0OooO0OO instanceof o000oOoO) {
                oooo0OooO0OO = oo000oVar.OooO0OO(c2051skOooOOOo, oooo0);
            }
            if (oooo0OooO0OO instanceof OooOO0) {
                return ((OooOO0) oooo0OooO0OO).f26423OooOo0O;
            }
        }
        return o00oo0;
    }

    @Override // com.google.android.gms.internal.measurement.OooOOO0, com.google.android.gms.internal.measurement.Oooo0
    public final Oooo0 zzt() {
        return new Oooo000(this);
    }

    public Oooo000(String str, ArrayList arrayList, List list, C2051sk c2051sk) {
        super(str);
        this.f26437OooOo = new ArrayList();
        this.f26438OooOoO = c2051sk;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                this.f26437OooOo.add(((Oooo0) obj).zzc());
            }
        }
        this.f26439OooOoO0 = new ArrayList(list);
    }
}
