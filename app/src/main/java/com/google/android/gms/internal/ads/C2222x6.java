package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.x6 */
/* loaded from: classes2.dex */
public final class C2222x6 {

    /* renamed from: OooO00o */
    public final ArrayList f25526OooO00o = new ArrayList();

    /* renamed from: OooO0O0 */
    public final ArrayList f25527OooO0O0 = new ArrayList();

    /* renamed from: OooO0OO */
    public final ArrayList f25528OooO0OO = new ArrayList();

    public final ArrayList OooO00o() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f25527OooO0O0;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String str = (String) zzbe.zzc().OooO00o((C2148v6) obj);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ze0.Oooo0OO(arrayList3, new oOo0o00("", "gad:dynamite_module:experiment_id", 4));
        ze0.Oooo0OO(arrayList3, AbstractC1641hg.f19730OooOOO0);
        ze0.Oooo0OO(arrayList3, AbstractC1641hg.f19729OooOOO);
        ze0.Oooo0OO(arrayList3, AbstractC1641hg.f19731OooOOOO);
        ze0.Oooo0OO(arrayList3, AbstractC1641hg.f19732OooOOOo);
        ze0.Oooo0OO(arrayList3, AbstractC1641hg.f19734OooOOo0);
        ze0.Oooo0OO(arrayList3, AbstractC1641hg.f19750Oooo00O);
        ze0.Oooo0OO(arrayList3, AbstractC1641hg.f19733OooOOo);
        ze0.Oooo0OO(arrayList3, AbstractC1641hg.f19741OooOoO0);
        ze0.Oooo0OO(arrayList3, AbstractC1641hg.f19740OooOoO);
        ze0.Oooo0OO(arrayList3, AbstractC1641hg.f19742OooOoOO);
        ze0.Oooo0OO(arrayList3, AbstractC1641hg.f19744OooOoo0);
        ze0.Oooo0OO(arrayList3, AbstractC1641hg.f19743OooOoo);
        ze0.Oooo0OO(arrayList3, AbstractC1641hg.f19745OooOooO);
        ze0.Oooo0OO(arrayList3, AbstractC1641hg.f19746OooOooo);
        ze0.Oooo0OO(arrayList3, AbstractC1641hg.f19749Oooo000);
        ze0.Oooo0OO(arrayList3, AbstractC1641hg.f19735OooOOoo);
        ze0.Oooo0OO(arrayList3, AbstractC1641hg.f19737OooOo00);
        ze0.Oooo0OO(arrayList3, AbstractC1641hg.OooOo0);
        ze0.Oooo0OO(arrayList3, AbstractC1641hg.f19738OooOo0O);
        ze0.Oooo0OO(arrayList3, AbstractC1641hg.f19739OooOo0o);
        ze0.Oooo0OO(arrayList3, AbstractC1641hg.f19736OooOo);
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public final ArrayList OooO0O0() {
        ArrayList arrayListOooO00o = OooO00o();
        ArrayList arrayList = this.f25528OooO0OO;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) zzbe.zzc().OooO00o((C2148v6) obj);
            if (!TextUtils.isEmpty(str)) {
                arrayListOooO00o.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ze0.Oooo0OO(arrayList2, AbstractC1641hg.f19751Oooo00o);
        arrayListOooO00o.addAll(arrayList2);
        return arrayListOooO00o;
    }
}
