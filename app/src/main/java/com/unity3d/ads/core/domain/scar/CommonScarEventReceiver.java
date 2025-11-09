package com.unity3d.ads.core.domain.scar;

import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import o00O0.OooOo00;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oo.o0000oo;
import o00O0ooo.o0OO0oO0;
import o00O0ooo.o0OOO00;
import o00O0ooo.o0OOO0OO;
import o00O0ooo.o0OOo000;
import o00O0ooo.o0o0000;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class CommonScarEventReceiver implements IEventSender {
    private final o0OO0oO0 _gmaEventFlow;
    private final o0OO0oO0 _versionFlow;
    private final o0OOO0OO gmaEventFlow;
    private final o000OO scope;
    private final o0OOO0OO versionFlow;

    @OooO(m13471c = "com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1", m13472f = "CommonScarEventReceiver.kt", m13473l = {35, 41, 52, 66, 73}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1 */
    public static final class C41841 extends OooOOOO implements o00O0O {
        final /* synthetic */ Enum<?> $eventId;
        final /* synthetic */ Object[] $params;
        int label;
        final /* synthetic */ CommonScarEventReceiver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41841(Enum<?> r1, Object[] objArr, CommonScarEventReceiver commonScarEventReceiver, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$eventId = r1;
            this.$params = objArr;
            this.this$0 = commonScarEventReceiver;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C41841(this.$eventId, this.$params, this.this$0, oooO0OO);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        
            if (r3.emit(r2, r21) == r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            if (r3.emit(r7, r21) == r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c2, code lost:
        
            if (r3.emit(r6, r21) == r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0122, code lost:
        
            if (r2.emit(r11, r21) == r1) goto L42;
         */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
        @Override // o00O0OO0.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 296
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.scar.CommonScarEventReceiver.C41841.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C41841) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public CommonScarEventReceiver(o000OO scope) {
        kotlin.jvm.internal.OooOo.OooO0o0(scope, "scope");
        this.scope = scope;
        o0OOo000 o0ooo000OooO00o = o0o0000.OooO00o((7 & 1) != 0 ? 0 : 100, (7 & 2) == 0 ? 64 : 0, o0000oo.f31602OooOo0O);
        this._versionFlow = o0ooo000OooO00o;
        this.versionFlow = new o0OOO00(o0ooo000OooO00o);
        o0OOo000 o0ooo000OooO00o2 = o0o0000.OooO00o((7 & 1) != 0 ? 0 : 100, (7 & 2) == 0 ? 64 : 0, o0000oo.f31602OooOo0O);
        this._gmaEventFlow = o0ooo000OooO00o2;
        this.gmaEventFlow = new o0OOO00(o0ooo000OooO00o2);
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean canSend() {
        return true;
    }

    public final o0OOO0OO getGmaEventFlow() {
        return this.gmaEventFlow;
    }

    public final o0OOO0OO getVersionFlow() {
        return this.versionFlow;
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean sendEvent(Enum<?> eventCategory, Enum<?> eventId, Object... params) {
        kotlin.jvm.internal.OooOo.OooO0o0(eventCategory, "eventCategory");
        kotlin.jvm.internal.OooOo.OooO0o0(eventId, "eventId");
        kotlin.jvm.internal.OooOo.OooO0o0(params, "params");
        if (!OooOo00.OooOoO0(o000OOo.OooOO0(WebViewEventCategory.INIT_GMA, WebViewEventCategory.GMA, WebViewEventCategory.BANNER), eventCategory)) {
            return false;
        }
        o0000OO0.OooOo0(this.scope, null, new C41841(eventId, params, this, null), 3);
        return true;
    }
}
