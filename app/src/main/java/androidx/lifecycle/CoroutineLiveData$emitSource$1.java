package androidx.lifecycle;

@o00O0OO0.OooO(m13471c = "androidx.lifecycle.CoroutineLiveData", m13472f = "CoroutineLiveData.kt", m13473l = {228, 229}, m13474m = "emitSource$lifecycle_livedata_release")
/* loaded from: classes.dex */
public final class CoroutineLiveData$emitSource$1 extends o00O0OO0.OooO0OO {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CoroutineLiveData<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineLiveData$emitSource$1(CoroutineLiveData<T> coroutineLiveData, o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
        this.this$0 = coroutineLiveData;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emitSource$lifecycle_livedata_release(null, this);
    }
}
