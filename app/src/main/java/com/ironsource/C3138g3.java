package com.ironsource;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3621s9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.g3 */
/* loaded from: classes2.dex */
public class C3138g3 implements InterfaceC3475o3 {

    /* renamed from: a */
    private final InterfaceC3242j3 f8679a;

    /* renamed from: b */
    private final InterfaceC3903zf f8680b;

    /* renamed from: c */
    private final InterfaceC3460nn<Integer, Integer> f8681c;

    /* renamed from: d */
    private final InterfaceC3621s9 f8682d;

    /* renamed from: e */
    private List<InterfaceC3312l3> f8683e;

    public C3138g3(InterfaceC3242j3 eventBaseData, InterfaceC3903zf eventsManager, InterfaceC3460nn<Integer, Integer> eventsMapper, InterfaceC3621s9 currentTimeProvider) {
        kotlin.jvm.internal.OooOo.OooO0o0(eventBaseData, "eventBaseData");
        kotlin.jvm.internal.OooOo.OooO0o0(eventsManager, "eventsManager");
        kotlin.jvm.internal.OooOo.OooO0o0(eventsMapper, "eventsMapper");
        kotlin.jvm.internal.OooOo.OooO0o0(currentTimeProvider, "currentTimeProvider");
        this.f8679a = eventBaseData;
        this.f8680b = eventsManager;
        this.f8681c = eventsMapper;
        this.f8682d = currentTimeProvider;
        this.f8683e = new ArrayList();
    }

    @Override // com.ironsource.InterfaceC3475o3
    /* renamed from: a */
    public void mo8859a() {
        this.f8683e.clear();
    }

    /* renamed from: b */
    public final List<InterfaceC3312l3> m8863b() {
        return this.f8683e;
    }

    public /* synthetic */ C3138g3(InterfaceC3242j3 interfaceC3242j3, InterfaceC3903zf interfaceC3903zf, InterfaceC3460nn interfaceC3460nn, InterfaceC3621s9 interfaceC3621s9, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(interfaceC3242j3, interfaceC3903zf, interfaceC3460nn, (i & 8) != 0 ? new InterfaceC3621s9.a() : interfaceC3621s9);
    }

    /* renamed from: b */
    private final JSONObject m8858b(List<? extends InterfaceC3312l3> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends InterfaceC3312l3> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo9576a(linkedHashMap);
        }
        return new JSONObject(linkedHashMap);
    }

    @Override // com.ironsource.InterfaceC3475o3
    /* renamed from: a */
    public void mo8860a(int i, List<InterfaceC3312l3> arrayList) {
        kotlin.jvm.internal.OooOo.OooO0o0(arrayList, "arrayList");
        try {
            ArrayList<InterfaceC3312l3> arrayListMo9251a = this.f8679a.mo9251a();
            int size = arrayListMo9251a.size();
            int i2 = 0;
            while (i2 < size) {
                InterfaceC3312l3 interfaceC3312l3 = arrayListMo9251a.get(i2);
                i2++;
                arrayList.add(interfaceC3312l3);
            }
            Iterator<InterfaceC3312l3> it = this.f8683e.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            this.f8680b.mo12605a(new C3899zb(this.f8681c.mo8213a(Integer.valueOf(i)).intValue(), this.f8682d.mo11889a(), m8858b(arrayList)));
        } catch (Exception e) {
            StringBuilder sbOooOOO0 = AbstractC2183w4.OooOOO0(e, "LogRemote | Exception: ");
            sbOooOOO0.append(e.getMessage());
            System.out.println((Object) sbOooOOO0.toString());
        }
    }

    /* renamed from: a */
    public final void m8861a(List<InterfaceC3312l3> list) {
        kotlin.jvm.internal.OooOo.OooO0o0(list, "<set-?>");
        this.f8683e = list;
    }

    @Override // com.ironsource.InterfaceC3475o3
    /* renamed from: a */
    public void mo8862a(InterfaceC3312l3... analyticsEventEntity) {
        kotlin.jvm.internal.OooOo.OooO0o0(analyticsEventEntity, "analyticsEventEntity");
        for (InterfaceC3312l3 interfaceC3312l3 : analyticsEventEntity) {
            this.f8683e.add(interfaceC3312l3);
        }
    }
}
