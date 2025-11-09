package androidx.datastore.core;

import androidx.datastore.core.MultiProcessCoordinator;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;

@OooO(m13471c = "androidx.datastore.core.MultiProcessCoordinator$Companion", m13472f = "MultiProcessCoordinator.android.kt", m13473l = {182}, m13474m = "getExclusiveFileLockWithRetryIfDeadlock")
/* renamed from: androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 */
/* loaded from: classes.dex */
public final class C0313xe413854a extends OooO0OO {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MultiProcessCoordinator.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0313xe413854a(MultiProcessCoordinator.Companion companion, o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
        this.this$0 = companion;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getExclusiveFileLockWithRetryIfDeadlock(null, this);
    }
}
