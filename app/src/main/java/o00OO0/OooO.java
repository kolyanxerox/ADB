package o00OO0;

import com.google.android.gms.internal.measurement.o0OO0O0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.OooOo;
import o00O0.OooOo00;
import o00O0Oo.Oooo000;
import o00O0Oo.o00O0O;
import o00O0Oo.o00Oo0;
import o00O0oOo.o0OOO0o;
import o00O0oOo.o0Oo0oo;
import o00O0oOo.o0oOOo;
import o00OO000.o00Ooo;

/* loaded from: classes3.dex */
public final class OooO implements o0OOO0o, OooOO0, o0oOOo {

    /* renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31890OooOoOO = AtomicReferenceFieldUpdater.newUpdater(OooO.class, Object.class, "state$volatile");

    /* renamed from: OooOo, reason: collision with root package name */
    public Object f31891OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o00O0O0O.OooOOO0 f31892OooOo0O;
    private volatile /* synthetic */ Object state$volatile = OooOOO0.f31916OooO00o;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public ArrayList f31893OooOo0o = new ArrayList(2);

    /* renamed from: OooOoO0, reason: collision with root package name */
    public int f31895OooOoO0 = -1;

    /* renamed from: OooOoO, reason: collision with root package name */
    public Object f31894OooOoO = OooOOO0.f31919OooO0Oo;

    public OooO(o00O0O0O.OooOOO0 oooOOO0) {
        this.f31892OooOo0O = oooOOO0;
    }

    @Override // o00O0oOo.o0OOO0o
    public final void OooO00o(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31890OooOoOO;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == OooOOO0.f31917OooO0O0) {
                return;
            }
            o000O0O0.OooO0O0 oooO0O0 = OooOOO0.f31918OooO0OO;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oooO0O0)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f31893OooOo0o;
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                ((OooO0OO) obj2).OooO0O0();
            }
            this.f31894OooOoO = OooOOO0.f31919OooO0Oo;
            this.f31893OooOo0o = null;
            return;
        }
    }

    @Override // o00O0oOo.o0oOOo
    public final void OooO0O0(o00Ooo o00ooo2, int i) {
        this.f31891OooOo = o00ooo2;
        this.f31895OooOoO0 = i;
    }

    public final Object OooO0OO(o00O0OO0.OooO0OO oooO0OO) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31890OooOoOO;
        Object obj = atomicReferenceFieldUpdater.get(this);
        OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        OooO0OO oooO0OO2 = (OooO0OO) obj;
        Object obj2 = this.f31894OooOoO;
        ArrayList arrayList = this.f31893OooOo0o;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                OooO0OO oooO0OO3 = (OooO0OO) obj3;
                if (oooO0OO3 != oooO0OO2) {
                    oooO0OO3.OooO0O0();
                }
            }
            atomicReferenceFieldUpdater.set(this, OooOOO0.f31917OooO0O0);
            this.f31894OooOoO = OooOOO0.f31919OooO0Oo;
            this.f31893OooOo0o = null;
        }
        Object objInvoke = oooO0OO2.f31900OooO0OO.invoke(oooO0OO2.f31898OooO00o, oooO0OO2.f31901OooO0Oo, obj2);
        o000O0O0.OooO0O0 oooO0O0 = OooOOO0.f31920OooO0o0;
        kotlin.jvm.internal.OooOOO oooOOO = oooO0OO2.f31903OooO0o0;
        return oooO0OO2.f31901OooO0Oo == oooO0O0 ? ((Oooo000) oooOOO).invoke(oooO0OO) : ((o00O0O) oooOOO).invoke(objInvoke, oooO0OO);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object OooO0Oo(o00O0OO0.OooO0OO r11) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r10 = this;
            boolean r0 = r11 instanceof o00OO0.OooO0o
            if (r0 == 0) goto L13
            r0 = r11
            o00OO0.OooO0o r0 = (o00OO0.OooO0o) r0
            int r1 = r0.f31909OooOoO0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31909OooOoO0 = r1
            goto L18
        L13:
            o00OO0.OooO0o r0 = new o00OO0.OooO0o
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f31908OooOo0o
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.f31909OooOoO0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            o00O0.o000OOo.OooOO0O(r11)
            return r11
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L33:
            o00OO0.OooO r2 = r0.f31907OooOo0O
            o00O0.o000OOo.OooOO0O(r11)
            goto Lb7
        L3a:
            o00O0.o000OOo.OooOO0O(r11)
            r0.f31907OooOo0O = r10
            r0.f31909OooOoO0 = r5
            o00O0oOo.oo0o0Oo r11 = new o00O0oOo.oo0o0Oo
            o00O0O0O.OooO0OO r2 = Oooo0o0.OooO.OooOOOO(r0)
            r11.<init>(r5, r2)
            r11.OooOOo0()
        L4d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = o00OO0.OooO.f31890OooOoOO
            java.lang.Object r6 = r2.get(r10)
            o000O0O0.OooO0O0 r7 = o00OO0.OooOOO0.f31916OooO00o
            oo00o.OooOo r8 = oo00o.OooOo.f33195OooO00o
            if (r6 != r7) goto L6a
        L59:
            boolean r7 = r2.compareAndSet(r10, r6, r11)
            if (r7 == 0) goto L63
            r11.OooOo0(r10)
            goto Laa
        L63:
            java.lang.Object r7 = r2.get(r10)
            if (r7 == r6) goto L59
            goto L4d
        L6a:
            boolean r9 = r6 instanceof java.util.List
            if (r9 == 0) goto L9b
        L6e:
            boolean r8 = r2.compareAndSet(r10, r6, r7)
            if (r8 == 0) goto L94
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r2 = r6.iterator()
        L7a:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L4d
            java.lang.Object r6 = r2.next()
            o00OO0.OooO0OO r6 = r10.OooO0o0(r6)
            kotlin.jvm.internal.OooOo.OooO0O0(r6)
            r6.f31902OooO0o = r3
            r7 = -1
            r6.f31904OooO0oO = r7
            r10.OooO0o(r6, r5)
            goto L7a
        L94:
            java.lang.Object r8 = r2.get(r10)
            if (r8 == r6) goto L6e
            goto L4d
        L9b:
            boolean r2 = r6 instanceof o00OO0.OooO0OO
            if (r2 == 0) goto Lc3
            o00OO0.OooO0OO r6 = (o00OO0.OooO0OO) r6
            java.lang.Object r2 = r10.f31894OooOoO
            o00O0Oo.o00Oo0 r2 = r6.OooO00o(r10, r2)
            r11.OooOoO(r8, r2)
        Laa:
            java.lang.Object r11 = r11.OooOOOo()
            o00O0O0o.OooOo00 r2 = o00O0O0o.OooOo00.f31365OooOo0O
            if (r11 != r2) goto Lb3
            r8 = r11
        Lb3:
            if (r8 != r1) goto Lb6
            goto Lc1
        Lb6:
            r2 = r10
        Lb7:
            r0.f31907OooOo0O = r3
            r0.f31909OooOoO0 = r4
            java.lang.Object r11 = r2.OooO0OO(r0)
            if (r11 != r1) goto Lc2
        Lc1:
            return r1
        Lc2:
            return r11
        Lc3:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OO0.OooO.OooO0Oo(o00O0OO0.OooO0OO):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.OooOo00, o00O0Oo.o00Oo0] */
    public final void OooO0o(OooO0OO oooO0OO, boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31890OooOoOO;
        if (atomicReferenceFieldUpdater.get(this) instanceof OooO0OO) {
            return;
        }
        Object obj = oooO0OO.f31898OooO00o;
        if (!z) {
            ArrayList arrayList = this.f31893OooOo0o;
            OooOo.OooO0O0(arrayList);
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((OooO0OO) obj2).f31898OooO00o == obj) {
                        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                    }
                }
            }
        }
        oooO0OO.f31899OooO0O0.invoke(obj, this, oooO0OO.f31901OooO0Oo);
        if (this.f31894OooOoO != OooOOO0.f31919OooO0Oo) {
            atomicReferenceFieldUpdater.set(this, oooO0OO);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.f31893OooOo0o;
            OooOo.OooO0O0(arrayList2);
            arrayList2.add(oooO0OO);
        }
        oooO0OO.f31902OooO0o = this.f31891OooOo;
        oooO0OO.f31904OooO0oO = this.f31895OooOoO0;
        this.f31891OooOo = null;
        this.f31895OooOoO0 = -1;
    }

    public final OooO0OO OooO0o0(Object obj) {
        ArrayList arrayList = this.f31893OooOo0o;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj3 = arrayList.get(i);
            i++;
            if (((OooO0OO) obj3).f31898OooO00o == obj) {
                obj2 = obj3;
                break;
            }
        }
        OooO0OO oooO0OO = (OooO0OO) obj2;
        if (oooO0OO != null) {
            return oooO0OO;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final boolean OooO0oO(Object obj, Object obj2) {
        return OooO0oo(obj, obj2) == 0;
    }

    public final int OooO0oo(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31890OooOoOO;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof o0Oo0oo)) {
                if (OooOo.OooO00o(obj3, OooOOO0.f31917OooO0O0) || (obj3 instanceof OooO0OO)) {
                    return 3;
                }
                if (OooOo.OooO00o(obj3, OooOOO0.f31918OooO0OO)) {
                    return 2;
                }
                if (OooOo.OooO00o(obj3, OooOOO0.f31916OooO00o)) {
                    List listOooOO0o = o0OO0O0.OooOO0o(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listOooOO0o)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList arrayListOooo00o = OooOo00.Oooo00o((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListOooo00o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            OooO0OO oooO0OOOooO0o0 = OooO0o0(obj);
            if (oooO0OOOooO0o0 != null) {
                o00Oo0 o00oo0OooO00o = oooO0OOOooO0o0.OooO00o(this, obj2);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, oooO0OOOooO0o0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                o0Oo0oo o0oo0oo = (o0Oo0oo) obj3;
                this.f31894OooOoO = obj2;
                o000O0O0.OooO0O0 oooO0O0OooOOOO = o0oo0oo.OooOOOO(oo00o.OooOo.f33195OooO00o, o00oo0OooO00o);
                if (oooO0O0OooOOOO == null) {
                    this.f31894OooOoO = OooOOO0.f31919OooO0Oo;
                    return 2;
                }
                o0oo0oo.OooOOo(oooO0O0OooOOOO);
                return 0;
            }
            continue;
        }
    }
}
