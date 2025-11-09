package androidx.work;

import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.OooOo;
import o00000oO.OooOOO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00O0oOo.oo0o0Oo;

/* loaded from: classes.dex */
public final class OperationKt {

    @OooO(m13471c = "androidx.work.OperationKt", m13472f = "Operation.kt", m13473l = {39}, m13474m = "await")
    /* renamed from: androidx.work.OperationKt$await$1 */
    public static final class C08691 extends OooO0OO {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C08691(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OperationKt.await(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object await(androidx.work.Operation r4, o00O0O0O.OooO0OO r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof androidx.work.OperationKt.C08691
            if (r0 == 0) goto L13
            r0 = r5
            androidx.work.OperationKt$await$1 r0 = (androidx.work.OperationKt.C08691) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.work.OperationKt$await$1 r0 = new androidx.work.OperationKt$await$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            o00000oO.OooOOO r4 = (o00000oO.OooOOO) r4
            o00O0.o000OOo.OooOO0O(r5)
            goto L75
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            o00O0.o000OOo.OooOO0O(r5)
            o00000oO.OooOOO r4 = r4.getResult()
            java.lang.String r5 = "result"
            kotlin.jvm.internal.OooOo.OooO0Oo(r4, r5)
            boolean r5 = r4.isDone()
            if (r5 == 0) goto L54
            java.lang.Object r4 = r4.get()     // Catch: java.util.concurrent.ExecutionException -> L4a
            goto L76
        L4a:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L52
            goto L53
        L52:
            r4 = r5
        L53:
            throw r4
        L54:
            r0.L$0 = r4
            r0.label = r3
            o00O0oOo.oo0o0Oo r5 = new o00O0oOo.oo0o0Oo
            o00O0O0O.OooO0OO r0 = Oooo0o0.OooO.OooOOOO(r0)
            r5.<init>(r3, r0)
            r5.OooOOo0()
            androidx.work.ListenableFutureKt$await$2$1 r0 = new androidx.work.ListenableFutureKt$await$2$1
            r0.<init>(r5, r4)
            androidx.work.DirectExecutor r2 = androidx.work.DirectExecutor.INSTANCE
            r4.addListener(r0, r2)
            java.lang.Object r5 = r5.OooOOOo()
            if (r5 != r1) goto L75
            return r1
        L75:
            r4 = r5
        L76:
            java.lang.String r5 = "result.await()"
            kotlin.jvm.internal.OooOo.OooO0Oo(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.OperationKt.await(androidx.work.Operation, o00O0O0O.OooO0OO):java.lang.Object");
    }

    private static final Object await$$forInline(Operation operation, o00O0O0O.OooO0OO oooO0OO) throws Throwable {
        Object objOooOOOo;
        OooOOO result = operation.getResult();
        OooOo.OooO0Oo(result, "result");
        if (result.isDone()) {
            try {
                objOooOOOo = result.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } else {
            oo0o0Oo oo0o0oo = new oo0o0Oo(1, Oooo0o0.OooO.OooOOOO(oooO0OO));
            oo0o0oo.OooOOo0();
            result.addListener(new ListenableFutureKt$await$2$1(oo0o0oo, result), DirectExecutor.INSTANCE);
            objOooOOOo = oo0o0oo.OooOOOo();
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        }
        OooOo.OooO0Oo(objOooOOOo, "result.await()");
        return objOooOOOo;
    }
}
