package androidx.datastore.core;

import o00O0O0o.OooOo00;
import o00O0OO0.OooO0OO;
import o00O0oOo.o00000;
import o00O0oOo.o00000O0;
import o00O0oOo.o0000OO0;
import o00OO0O0.OooO;
import oo00o.OooOo;

/* loaded from: classes.dex */
public abstract class RunOnce {
    private final o00OO0O0.OooO00o runMutex = OooO.OooO00o();
    private final o00000 didRun = o0000OO0.OooO00o();

    @o00O0OO0.OooO(m13471c = "androidx.datastore.core.RunOnce", m13472f = "DataStoreImpl.kt", m13473l = {544, 497}, m13474m = "runIfNeeded")
    /* renamed from: androidx.datastore.core.RunOnce$runIfNeeded$1 */
    public static final class C03211 extends OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03211(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RunOnce.this.runIfNeeded(this);
        }
    }

    public final Object awaitComplete(o00O0O0O.OooO0OO oooO0OO) throws Throwable {
        Object objOooOo0 = ((o00000O0) this.didRun).OooOo0(oooO0OO);
        return objOooOo0 == OooOo00.f31365OooOo0O ? objOooOo0 : OooOo.f33195OooO00o;
    }

    public abstract Object doRun(o00O0O0O.OooO0OO oooO0OO);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v6, types: [o00OO0O0.OooO00o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object runIfNeeded(o00O0O0O.OooO0OO r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.RunOnce.C03211
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = (androidx.datastore.core.RunOnce.C03211) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = new androidx.datastore.core.RunOnce$runIfNeeded$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            oo00o.OooOo r3 = oo00o.OooOo.f33195OooO00o
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L3f
            if (r2 != r4) goto L37
            java.lang.Object r1 = r0.L$1
            o00OO0O0.OooO00o r1 = (o00OO0O0.OooO00o) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.RunOnce r0 = (androidx.datastore.core.RunOnce) r0
            o00O0.o000OOo.OooOO0O(r8)     // Catch: java.lang.Throwable -> L35
            goto L8b
        L35:
            r8 = move-exception
            goto L9b
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r2 = r0.L$1
            o00OO0O0.OooO00o r2 = (o00OO0O0.OooO00o) r2
            java.lang.Object r5 = r0.L$0
            androidx.datastore.core.RunOnce r5 = (androidx.datastore.core.RunOnce) r5
            o00O0.o000OOo.OooOO0O(r8)
            r8 = r2
            goto L6c
        L4c:
            o00O0.o000OOo.OooOO0O(r8)
            o00O0oOo.o00000 r8 = r7.didRun
            o00O0oOo.o00O r8 = (o00O0oOo.o00O) r8
            boolean r8 = r8.Oooo0o0()
            if (r8 == 0) goto L5a
            return r3
        L5a:
            o00OO0O0.OooO00o r8 = r7.runMutex
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            o00OO0O0.OooO0o r8 = (o00OO0O0.OooO0o) r8
            java.lang.Object r2 = r8.OooO0Oo(r0)
            if (r2 != r1) goto L6b
            goto L88
        L6b:
            r5 = r7
        L6c:
            o00O0oOo.o00000 r2 = r5.didRun     // Catch: java.lang.Throwable -> L98
            o00O0oOo.o00O r2 = (o00O0oOo.o00O) r2     // Catch: java.lang.Throwable -> L98
            boolean r2 = r2.Oooo0o0()     // Catch: java.lang.Throwable -> L98
            if (r2 == 0) goto L7c
            o00OO0O0.OooO0o r8 = (o00OO0O0.OooO0o) r8
            r8.OooO0o(r6)
            return r3
        L7c:
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L98
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L98
            r0.label = r4     // Catch: java.lang.Throwable -> L98
            java.lang.Object r0 = r5.doRun(r0)     // Catch: java.lang.Throwable -> L98
            if (r0 != r1) goto L89
        L88:
            return r1
        L89:
            r1 = r8
            r0 = r5
        L8b:
            o00O0oOo.o00000 r8 = r0.didRun     // Catch: java.lang.Throwable -> L35
            o00O0oOo.o00000O0 r8 = (o00O0oOo.o00000O0) r8     // Catch: java.lang.Throwable -> L35
            r8.Oooo0oO(r3)     // Catch: java.lang.Throwable -> L35
            o00OO0O0.OooO0o r1 = (o00OO0O0.OooO0o) r1
            r1.OooO0o(r6)
            return r3
        L98:
            r0 = move-exception
            r1 = r8
            r8 = r0
        L9b:
            o00OO0O0.OooO0o r1 = (o00OO0O0.OooO0o) r1
            r1.OooO0o(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.RunOnce.runIfNeeded(o00O0O0O.OooO0OO):java.lang.Object");
    }
}
