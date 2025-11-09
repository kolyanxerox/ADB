package com.ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.ironsource.f3 */
/* loaded from: classes2.dex */
public final class C3103f3 implements InterfaceC3304ku<JSONArray> {

    /* renamed from: a */
    private final List<C3063e3> f8485a = new ArrayList();

    /* renamed from: com.ironsource.f3$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8486a;

        static {
            int[] iArr = new int[EnumC3269ju.values().length];
            try {
                iArr[EnumC3269ju.FullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3269ju.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8486a = iArr;
        }
    }

    /* renamed from: b */
    private final List<C3063e3> m8607b() {
        List<C3063e3> list = this.f8485a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C3063e3) obj).m8446e() != EnumC3200hu.LoadRequest) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final List<C3063e3> m8606a() {
        List<C3063e3> list = this.f8485a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C3063e3 c3063e3 = (C3063e3) obj;
            if (c3063e3.m8446e() != EnumC3200hu.LoadSuccess && c3063e3.m8446e() != EnumC3200hu.LoadRequest) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(o00O0.Oooo000.OooOo0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((C3063e3) obj2).m8442a());
        }
        Set setOooo0oo = o00O0.OooOo00.Oooo0oo(arrayList2);
        List<C3063e3> list2 = this.f8485a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list2) {
            C3063e3 c3063e32 = (C3063e3) obj3;
            if (c3063e32.m8446e() == EnumC3200hu.LoadSuccess && !setOooo0oo.contains(c3063e32.m8442a())) {
                arrayList3.add(obj3);
            }
        }
        return arrayList3;
    }

    @Override // com.ironsource.InterfaceC3075ef
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONArray mo8475a(EnumC3269ju mode) {
        kotlin.jvm.internal.OooOo.OooO0o0(mode, "mode");
        int i = a.f8486a[mode.ordinal()];
        if (i == 1) {
            List<C3063e3> listM8607b = m8607b();
            ArrayList arrayList = new ArrayList(o00O0.Oooo000.OooOo0(listM8607b, 10));
            Iterator<T> it = listM8607b.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3063e3) it.next()).m8445d());
            }
            return new JSONArray((Collection) arrayList);
        }
        if (i != 2) {
            throw new OooOOO0.OooO00o();
        }
        List<C3063e3> listM8606a = m8606a();
        ArrayList arrayList2 = new ArrayList(o00O0.Oooo000.OooOo0(listM8606a, 10));
        Iterator<T> it2 = listM8606a.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C3063e3) it2.next()).m8444c());
        }
        return new JSONArray((Collection) arrayList2);
    }

    /* renamed from: a */
    public final void m8608a(C3063e3 event) {
        kotlin.jvm.internal.OooOo.OooO0o0(event, "event");
        this.f8485a.add(event);
    }
}
