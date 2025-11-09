package o00OO000;

import com.google.android.gms.internal.measurement.o0OO0O0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o00O0oO.o0000;
import o00O0oOo.o0000O0;
import o00O0oOo.o00OOO0O;

/* loaded from: classes3.dex */
public abstract class OooO00o {

    /* renamed from: OooO00o */
    public static final o000O0O0.OooO0O0 f31922OooO00o = new o000O0O0.OooO0O0("CLOSED", 3);

    /* renamed from: OooO0O0 */
    public static final o000O0O0.OooO0O0 f31923OooO0O0 = new o000O0O0.OooO0O0("UNDEFINED", 3);

    /* renamed from: OooO0OO */
    public static final o000O0O0.OooO0O0 f31924OooO0OO = new o000O0O0.OooO0O0("REUSABLE_CLAIMED", 3);

    /* renamed from: OooO0Oo */
    public static final o000O0O0.OooO0O0 f31925OooO0Oo = new o000O0O0.OooO0O0("NO_THREAD_ELEMENTS", 3);

    /* renamed from: OooO0o0 */
    public static final o00O.o00oO0o f31927OooO0o0 = new o00O.o00oO0o(6);

    /* renamed from: OooO0o */
    public static final o00O.o00oO0o f31926OooO0o = new o00O.o00oO0o(7);

    /* renamed from: OooO0oO */
    public static final o00O.o00oO0o f31928OooO0oO = new o00O.o00oO0o(8);

    public static final long OooO(String str, long j, long j2, long j3) {
        String property;
        int i = o00oO0o.f31965OooO00o;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lOooOoo0 = o0000.OooOoo0(property);
        if (lOooOoo0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lOooOoo0.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final void OooO00o(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object OooO0O0(o00Ooo o00ooo2, long j, o00O0Oo.o00O0O o00o0o) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (o00ooo2.f31964OooOo >= j && !o00ooo2.OooO0Oo()) {
                return o00ooo2;
            }
            Object obj = OooO0O0.f31929OooOo0O.get(o00ooo2);
            o000O0O0.OooO0O0 oooO0O0 = f31922OooO00o;
            if (obj == oooO0O0) {
                return oooO0O0;
            }
            o00Ooo o00ooo3 = (o00Ooo) ((OooO0O0) obj);
            if (o00ooo3 == null) {
                o00ooo3 = (o00Ooo) o00o0o.invoke(Long.valueOf(o00ooo2.f31964OooOo + 1), o00ooo2);
                do {
                    atomicReferenceFieldUpdater = OooO0O0.f31929OooOo0O;
                    if (atomicReferenceFieldUpdater.compareAndSet(o00ooo2, null, o00ooo3)) {
                        if (o00ooo2.OooO0Oo()) {
                            o00ooo2.OooO0o0();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(o00ooo2) == null);
            }
            o00ooo2 = o00ooo3;
        }
    }

    public static final o00Ooo OooO0OO(Object obj) {
        if (obj != f31922OooO00o) {
            return (o00Ooo) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void OooO0Oo(o00O0O0O.OooOOO0 oooOOO0, Throwable th) {
        Throwable runtimeException;
        Iterator it = OooO0o.f31932OooO00o.iterator();
        while (it.hasNext()) {
            try {
                ((o0000O0) it.next()).handleException(oooOOO0, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    o0OO0O0.OooO00o(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            o0OO0O0.OooO00o(th, new OooO(oooOOO0));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final Object OooO0o(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final boolean OooO0o0(Object obj) {
        return obj == f31922OooO00o;
    }

    public static final void OooO0oO(o00O0O0O.OooOOO0 oooOOO0, Object obj) {
        if (obj == f31925OooO0Oo) {
            return;
        }
        if (!(obj instanceof o0OOO0o)) {
            Object objFold = oooOOO0.fold(null, f31926OooO0o);
            kotlin.jvm.internal.OooOo.OooO0OO(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            androidx.datastore.preferences.protobuf.OooO00o.OooOo(objFold);
            throw null;
        }
        o0OOO0o o0ooo0o = (o0OOO0o) obj;
        o00OOO0O[] o00ooo0oArr = o0ooo0o.f31967OooO0O0;
        int length = o00ooo0oArr.length - 1;
        if (length < 0) {
            return;
        }
        o00OOO0O o00ooo0o = o00ooo0oArr[length];
        kotlin.jvm.internal.OooOo.OooO0O0(null);
        Object obj2 = o0ooo0o.f31966OooO00o[length];
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:75:0x0049, B:77:0x0057, B:79:0x005d, B:92:0x008d, B:82:0x006b, B:84:0x0079, B:89:0x0084, B:91:0x008a, B:97:0x009a, B:100:0x00a3, B:99:0x00a0, B:87:0x007f), top: B:113:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OooO0oo(java.lang.Object r9, o00O0O0O.OooO0OO r10) {
        /*
            boolean r0 = r10 instanceof o00OO000.OooOO0
            if (r0 == 0) goto Lae
            o00OO000.OooOO0 r10 = (o00OO000.OooOO0) r10
            java.lang.Throwable r0 = oo00o.OooOOO0.OooO00o(r9)
            if (r0 != 0) goto Le
            r1 = r9
            goto L14
        Le:
            o00O0oOo.o0000Ooo r1 = new o00O0oOo.o0000Ooo
            r2 = 0
            r1.<init>(r2, r0)
        L14:
            o00O0oOo.o0000O00 r0 = r10.f31935OooOoO0
            o00O0O0O.OooO0OO r2 = r10.f31934OooOoO
            o00O0O0O.OooOOO0 r3 = r2.getContext()
            boolean r3 = r0.isDispatchNeeded(r3)
            r4 = 1
            if (r3 == 0) goto L2f
            r10.f31936OooOoOO = r1
            r10.f31515OooOo = r4
            o00O0O0O.OooOOO0 r9 = r2.getContext()
            r0.dispatch(r9, r10)
            return
        L2f:
            o00O0oOo.o00O000o r0 = o00O0oOo.o0o0Oo.OooO00o()
            long r5 = r0.f31530OooOo0O
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L46
            r10.f31936OooOoOO = r1
            r10.f31515OooOo = r4
            r0.OooOOO(r10)
            goto La8
        L46:
            r0.OooOOOo(r4)
            o00O0O0O.OooOOO0 r1 = r2.getContext()     // Catch: java.lang.Throwable -> L69
            o00O0oOo.o00O0 r3 = o00O0oOo.o00O0.f31523OooOo0O     // Catch: java.lang.Throwable -> L69
            o00O0O0O.OooOO0 r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L69
            o00O0oOo.o00O0O00 r1 = (o00O0oOo.o00O0O00) r1     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L6b
            boolean r3 = r1.isActive()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r9 = r1.OooO0o0()     // Catch: java.lang.Throwable -> L69
            oo00o.OooOO0O r9 = o00O0.o000OOo.OooO0O0(r9)     // Catch: java.lang.Throwable -> L69
            r10.resumeWith(r9)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r9 = move-exception
            goto La4
        L6b:
            java.lang.Object r1 = r10.f31937OooOoo0     // Catch: java.lang.Throwable -> L69
            o00O0O0O.OooOOO0 r3 = r2.getContext()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = OooOO0o(r3, r1)     // Catch: java.lang.Throwable -> L69
            o000O0O0.OooO0O0 r5 = o00OO000.OooO00o.f31925OooO0Oo     // Catch: java.lang.Throwable -> L69
            if (r1 == r5) goto L7e
            o00O0oOo.o0O00o0 r5 = o00O0oOo.o0000OO0.Oooo000(r2, r3, r1)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r2.resumeWith(r9)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r9 = r5.OooooO0()     // Catch: java.lang.Throwable -> L69
            if (r9 == 0) goto L8d
        L8a:
            OooO0oO(r3, r1)     // Catch: java.lang.Throwable -> L69
        L8d:
            boolean r9 = r0.OooOOoo()     // Catch: java.lang.Throwable -> L69
            if (r9 != 0) goto L8d
        L93:
            r0.OooOOO0(r4)
            goto La8
        L97:
            r9 = move-exception
            if (r5 == 0) goto La0
            boolean r2 = r5.OooooO0()     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto La3
        La0:
            OooO0oO(r3, r1)     // Catch: java.lang.Throwable -> L69
        La3:
            throw r9     // Catch: java.lang.Throwable -> L69
        La4:
            r10.OooO0o(r9)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r9 = move-exception
            r0.OooOOO0(r4)
            throw r9
        Lae:
            r10.resumeWith(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OO000.OooO00o.OooO0oo(java.lang.Object, o00O0O0O.OooO0OO):void");
    }

    public static int OooOO0(int i, int i2, String str) {
        return (int) OooO(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object OooOO0O(o00O0O0O.OooOOO0 oooOOO0) {
        Object objFold = oooOOO0.fold(0, f31927OooO0o0);
        kotlin.jvm.internal.OooOo.OooO0O0(objFold);
        return objFold;
    }

    public static final Object OooOO0o(o00O0O0O.OooOOO0 oooOOO0, Object obj) {
        if (obj == null) {
            obj = OooOO0O(oooOOO0);
        }
        if (obj == 0) {
            return f31925OooO0Oo;
        }
        if (obj instanceof Integer) {
            return oooOOO0.fold(new o0OOO0o(((Number) obj).intValue(), oooOOO0), f31928OooO0oO);
        }
        androidx.datastore.preferences.protobuf.OooO00o.OooOo(obj);
        throw null;
    }
}
