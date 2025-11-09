package com.ironsource;

import com.ironsource.C3884yu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.ironsource.kw */
/* loaded from: classes2.dex */
public final class C3306kw implements InterfaceC3265jq {

    /* renamed from: a */
    private final C3349m1 f9274a;

    /* renamed from: b */
    private final Runnable f9275b;

    /* renamed from: c */
    private final long f9276c;

    /* renamed from: d */
    private final List<AbstractC3231iq> f9277d;

    /* renamed from: e */
    private final C3884yu f9278e;

    /* JADX WARN: Multi-variable type inference failed */
    public C3306kw(C3349m1 adTools, Runnable task, long j, List<? extends AbstractC3231iq> pauseTriggers) {
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        kotlin.jvm.internal.OooOo.OooO0o0(pauseTriggers, "pauseTriggers");
        this.f9274a = adTools;
        this.f9275b = task;
        this.f9276c = j;
        this.f9277d = pauseTriggers;
        this.f9278e = new C3884yu(adTools.m13083a(), new o00Ooo(this, 1), j);
        for (AbstractC3231iq abstractC3231iq : pauseTriggers) {
            abstractC3231iq.m9374a(this);
            if (abstractC3231iq.m9377d()) {
                m9707a(abstractC3231iq.mo7852b());
            }
        }
        if (m9709a()) {
            C3884yu.a aVarMo9225b = this.f9278e.mo9225b();
            List<AbstractC3231iq> list = this.f9277d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((AbstractC3231iq) obj).m9377d()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it.next();
            if (it.hasNext()) {
                long jM9376c = ((AbstractC3231iq) next).m9376c();
                do {
                    Object next2 = it.next();
                    long jM9376c2 = ((AbstractC3231iq) next2).m9376c();
                    if (jM9376c > jM9376c2) {
                        next = next2;
                        jM9376c = jM9376c2;
                    }
                } while (it.hasNext());
            }
            m9708a(((AbstractC3231iq) next).mo7852b(), aVarMo9225b);
        }
    }

    /* renamed from: b */
    private final void m9710b() {
        m9715c();
        this.f9275b.run();
    }

    @Override // com.ironsource.InterfaceC3265jq
    /* renamed from: a */
    public void mo9534a(AbstractC3231iq pauseableTrigger) {
        kotlin.jvm.internal.OooOo.OooO0o0(pauseableTrigger, "pauseableTrigger");
        this.f9274a.m13101d(new o00Oo0(this, pauseableTrigger, 1));
    }

    /* renamed from: c */
    public final void m9715c() {
        this.f9274a.m13101d(new o00Ooo(this, 0));
    }

    public /* synthetic */ C3306kw(C3349m1 c3349m1, Runnable runnable, long j, List list, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(c3349m1, runnable, j, (i & 8) != 0 ? new ArrayList() : list);
    }

    /* renamed from: a */
    public static final void m9705a(C3306kw this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        Iterator<AbstractC3231iq> it = this$0.f9277d.iterator();
        while (it.hasNext()) {
            it.next().m9374a((InterfaceC3265jq) null);
        }
        this$0.f9278e.mo9225b();
    }

    @Override // com.ironsource.InterfaceC3265jq
    /* renamed from: b */
    public void mo9535b(AbstractC3231iq pauseableTrigger) {
        kotlin.jvm.internal.OooOo.OooO0o0(pauseableTrigger, "pauseableTrigger");
        this.f9274a.m13101d(new o00Oo0(this, pauseableTrigger, 0));
    }

    /* renamed from: a */
    public static final void m9706a(C3306kw this$0, AbstractC3231iq pauseableTrigger) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(pauseableTrigger, "$pauseableTrigger");
        this$0.m9707a(pauseableTrigger.mo7852b());
        if (!this$0.m9709a() || this$0.f9278e.m13226e()) {
            return;
        }
        this$0.m9708a(pauseableTrigger.mo7852b(), this$0.f9278e.mo9225b());
    }

    /* renamed from: b */
    public static final void m9711b(C3306kw this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m9710b();
    }

    /* renamed from: a */
    private final void m9707a(String str) {
        this.f9274a.m9970e().m7911h().m9914d(str);
    }

    /* renamed from: b */
    public static final void m9712b(C3306kw this$0, AbstractC3231iq pauseableTrigger) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(pauseableTrigger, "$pauseableTrigger");
        this$0.m9713b(pauseableTrigger.mo7852b());
        if (this$0.m9709a() || !this$0.f9278e.m13226e()) {
            return;
        }
        this$0.m9714b(pauseableTrigger.mo7852b(), this$0.f9278e.mo9224a());
    }

    /* renamed from: a */
    private final void m9708a(String str, C3884yu.a aVar) {
        this.f9274a.m9970e().m7911h().m9905a(str, this.f9276c, aVar.m13231c(), aVar.m13232d());
    }

    /* renamed from: b */
    private final void m9713b(String str) {
        this.f9274a.m9970e().m7911h().m9916e(str);
    }

    /* renamed from: a */
    private final boolean m9709a() {
        List<AbstractC3231iq> list = this.f9277d;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((AbstractC3231iq) it.next()).m9377d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m9714b(String str, C3884yu.a aVar) {
        this.f9274a.m9970e().m7911h().m9910b(str, this.f9276c, aVar.m13231c(), aVar.m13232d());
    }
}
