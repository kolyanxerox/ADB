package com.unity3d.ads.core.utils;

import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.OooO0O0;
import o00O0Oo.o00O0O;
import o00O0oOo.o00000O;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oOo.o00O0O00;
import o00O0oOo.o00OOO0;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class CommonCoroutineTimer implements CoroutineTimer {
    private final o0000O00 dispatcher;
    private final o00000O job;
    private final o000OO scope;

    @OooO(m13471c = "com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1", m13472f = "CommonCoroutineTimer.kt", m13473l = {21, 24}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1 */
    public static final class C41911 extends OooOOOO implements o00O0O {
        final /* synthetic */ OooO0O0 $action;
        final /* synthetic */ long $delayStartMillis;
        final /* synthetic */ long $repeatMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41911(long j, OooO0O0 oooO0O0, long j2, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$delayStartMillis = j;
            this.$action = oooO0O0;
            this.$repeatMillis = j2;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C41911 c41911 = new C41911(this.$delayStartMillis, this.$action, this.$repeatMillis, oooO0OO);
            c41911.L$0 = obj;
            return c41911;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            o000OO o000oo2;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                o000oo2 = (o000OO) this.L$0;
                long j = this.$delayStartMillis;
                this.L$0 = o000oo2;
                this.label = 1;
                if (o0000OO0.OooOO0O(j, this) != oooOo00) {
                }
                return oooOo00;
            }
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000oo2 = (o000OO) this.L$0;
            o000OOo.OooOO0O(obj);
            while (o0000OO0.OooOo00(o000oo2)) {
                this.$action.invoke();
                long j2 = this.$repeatMillis;
                this.L$0 = o000oo2;
                this.label = 2;
                if (o0000OO0.OooOO0O(j2, this) == oooOo00) {
                    return oooOo00;
                }
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C41911) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public CommonCoroutineTimer(o0000O00 dispatcher) {
        kotlin.jvm.internal.OooOo.OooO0o0(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        o00OOO0 o00ooo0OooO0o0 = o0000OO0.OooO0o0();
        this.job = o00ooo0OooO0o0;
        this.scope = o0000OO0.OooO0O0(dispatcher.plus(o00ooo0OooO0o0));
    }

    @Override // com.unity3d.ads.core.utils.CoroutineTimer
    public o00O0O00 start(long j, long j2, OooO0O0 action) {
        kotlin.jvm.internal.OooOo.OooO0o0(action, "action");
        return o0000OO0.OooOo0(this.scope, this.dispatcher, new C41911(j, action, j2, null), 2);
    }
}
