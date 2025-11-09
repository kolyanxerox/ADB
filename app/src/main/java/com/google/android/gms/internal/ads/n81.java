package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public abstract class n81 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f21436OooO00o = new ArrayList(1);

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final HashSet f21437OooO0O0 = new HashSet(1);

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o71 f21438OooO0OO = new o71(new CopyOnWriteArrayList(), null);

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o71 f21439OooO0Oo = new o71(new CopyOnWriteArrayList(), null);

    /* renamed from: OooO0o, reason: collision with root package name */
    public AbstractC1787lf f21440OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public Looper f21441OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public o61 f21442OooO0oO;

    public final void OooO(i91 i91Var, gb1 gb1Var, o61 o61Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f21441OooO0o0;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        af0.OoooO0(z);
        this.f21442OooO0oO = o61Var;
        AbstractC1787lf abstractC1787lf = this.f21440OooO0o;
        this.f21436OooO00o.add(i91Var);
        if (this.f21441OooO0o0 == null) {
            this.f21441OooO0o0 = looperMyLooper;
            this.f21437OooO0O0.add(i91Var);
            OooOO0(gb1Var);
        } else if (abstractC1787lf != null) {
            OooO0oO(i91Var);
            i91Var.OooO00o(this, abstractC1787lf);
        }
    }

    public abstract void OooO00o(g91 g91Var);

    public abstract g91 OooO0O0(h91 h91Var, eb1 eb1Var, long j);

    public abstract C1550f OooO0OO();

    public void OooO0o() {
    }

    public final void OooO0o0(i91 i91Var) {
        HashSet hashSet = this.f21437OooO0O0;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(i91Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        OooO0o();
    }

    public final void OooO0oO(i91 i91Var) {
        this.f21441OooO0o0.getClass();
        HashSet hashSet = this.f21437OooO0O0;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(i91Var);
        if (zIsEmpty) {
            OooO0oo();
        }
    }

    public void OooO0oo() {
    }

    public abstract void OooOO0(gb1 gb1Var);

    public final void OooOO0O(AbstractC1787lf abstractC1787lf) {
        this.f21440OooO0o = abstractC1787lf;
        ArrayList arrayList = this.f21436OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((i91) arrayList.get(i)).OooO00o(this, abstractC1787lf);
        }
    }

    public final void OooOO0o(i91 i91Var) {
        ArrayList arrayList = this.f21436OooO00o;
        arrayList.remove(i91Var);
        if (!arrayList.isEmpty()) {
            OooO0o0(i91Var);
            return;
        }
        this.f21441OooO0o0 = null;
        this.f21440OooO0o = null;
        this.f21442OooO0oO = null;
        this.f21437OooO0O0.clear();
        OooOOO0();
    }

    public final void OooOOO(p71 p71Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f21439OooO0Oo.f22355OooO0O0;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            n71 n71Var = (n71) it.next();
            if (n71Var.f21430OooO00o == p71Var) {
                copyOnWriteArrayList.remove(n71Var);
            }
        }
    }

    public abstract void OooOOO0();

    public final void OooOOOO(l91 l91Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f21438OooO0OO.f22355OooO0O0;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            k91 k91Var = (k91) it.next();
            if (k91Var.f20468OooO0O0 == l91Var) {
                copyOnWriteArrayList.remove(k91Var);
            }
        }
    }

    public abstract void OooOOOo(C1550f c1550f);

    public abstract void OooOOo();

    public void OooO0Oo() {
    }

    public void OooOOo0() {
    }
}
