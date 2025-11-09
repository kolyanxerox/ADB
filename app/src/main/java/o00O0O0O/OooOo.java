package o00O0O0o;

import kotlin.jvm.internal.o0O0O00;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0OO0.OooOOO0;
import o00O0Oo.o00O0O;

/* loaded from: classes3.dex */
public final class OooOo extends OooOOO0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f31361OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f31362OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00O0O f31363OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(OooO0OO oooO0OO, OooO0OO oooO0OO2, o00O0O o00o0o) {
        super(oooO0OO);
        this.f31363OooOo0o = o00o0o;
        this.f31361OooOo = oooO0OO2;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        int i = this.f31362OooOo0O;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f31362OooOo0O = 2;
            o000OOo.OooOO0O(obj);
            return obj;
        }
        this.f31362OooOo0O = 1;
        o000OOo.OooOO0O(obj);
        o00O0O o00o0o = this.f31363OooOo0o;
        kotlin.jvm.internal.OooOo.OooO0OO(o00o0o, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        o0O0O00.OooO0O0(2, o00o0o);
        return o00o0o.invoke(this.f31361OooOo, this);
    }
}
