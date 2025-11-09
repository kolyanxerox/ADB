package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import o00O0O0O.OooO0OO;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import oo00o.OooOo;

@OooO(m13471c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2", m13472f = "InitializeStateLoadWeb.kt", m13473l = {46, 64, 71}, m13474m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class InitializeStateLoadWeb$doWork$2 extends OooOOOO implements o00O0O {
    final /* synthetic */ InitializeStateLoadWeb.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$2(InitializeStateLoadWeb.Params params, InitializeStateLoadWeb initializeStateLoadWeb, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.$params = params;
        this.this$0 = initializeStateLoadWeb;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new InitializeStateLoadWeb$doWork$2(this.$params, this.this$0, oooO0OO);
        initializeStateLoadWeb$doWork$2.L$0 = obj;
        return initializeStateLoadWeb$doWork$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x015e, code lost:
    
        if (r1 == r8) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113 A[Catch: all -> 0x0047, TRY_ENTER, TryCatch #3 {all -> 0x0047, blocks: (B:17:0x003c, B:42:0x0132, B:39:0x0113), top: B:79:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0142 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #5 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:8:0x0018, B:50:0x0161, B:54:0x0185, B:56:0x018f, B:59:0x019a, B:60:0x01ac, B:62:0x01af, B:63:0x01bb, B:45:0x013e, B:47:0x0142, B:51:0x0165, B:52:0x0177, B:44:0x0139, B:37:0x010f, B:53:0x0178, B:36:0x010b, B:27:0x0072), top: B:79:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0165 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #5 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:8:0x0018, B:50:0x0161, B:54:0x0185, B:56:0x018f, B:59:0x019a, B:60:0x01ac, B:62:0x01af, B:63:0x01bb, B:45:0x013e, B:47:0x0142, B:51:0x0165, B:52:0x0177, B:44:0x0139, B:37:0x010f, B:53:0x0178, B:36:0x010b, B:27:0x0072), top: B:79:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0178 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #5 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:8:0x0018, B:50:0x0161, B:54:0x0185, B:56:0x018f, B:59:0x019a, B:60:0x01ac, B:62:0x01af, B:63:0x01bb, B:45:0x013e, B:47:0x0142, B:51:0x0165, B:52:0x0177, B:44:0x0139, B:37:0x010f, B:53:0x0178, B:36:0x010b, B:27:0x0072), top: B:79:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01af A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #5 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:8:0x0018, B:50:0x0161, B:54:0x0185, B:56:0x018f, B:59:0x019a, B:60:0x01ac, B:62:0x01af, B:63:0x01bb, B:45:0x013e, B:47:0x0142, B:51:0x0165, B:52:0x0177, B:44:0x0139, B:37:0x010f, B:53:0x0178, B:36:0x010b, B:27:0x0072), top: B:79:0x000c }] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.unity3d.services.core.network.model.HttpRequest] */
    /* JADX WARN: Type inference failed for: r1v26, types: [com.unity3d.services.core.network.model.HttpRequest] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    @Override // o00O0OO0.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
        return ((InitializeStateLoadWeb$doWork$2) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
