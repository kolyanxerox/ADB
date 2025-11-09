package androidx.window.area;

import androidx.window.extensions.area.ExtensionWindowAreaStatus;
import androidx.window.extensions.core.util.function.Consumer;
import java.util.Collection;
import kotlin.jvm.internal.Oooo000;
import o000O00.o00O0O0O;
import o00O0.OooOo00;
import o00O0.o000OOo;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oo.o00oOoo;
import o00O0oo.o0O0ooO;
import oo00o.OooOo;

@OooO(m13471c = "androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1", m13472f = "WindowAreaControllerImpl.kt", m13473l = {94}, m13474m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WindowAreaControllerImpl$windowAreaInfos$1 extends OooOOOO implements o00O0O {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WindowAreaControllerImpl this$0;

    /* renamed from: androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1$1 */
    public static final class C08351 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ Consumer<Integer> $rearDisplayListener;
        final /* synthetic */ Consumer<ExtensionWindowAreaStatus> $rearDisplayPresentationListener;
        final /* synthetic */ WindowAreaControllerImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08351(WindowAreaControllerImpl windowAreaControllerImpl, Consumer<Integer> consumer, Consumer<ExtensionWindowAreaStatus> consumer2) {
            super(0);
            this.this$0 = windowAreaControllerImpl;
            this.$rearDisplayListener = consumer;
            this.$rearDisplayPresentationListener = consumer2;
        }

        @Override // o00O0Oo.OooO0O0
        public /* bridge */ /* synthetic */ Object invoke() {
            m13537invoke();
            return OooOo.f33195OooO00o;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m13537invoke() {
            this.this$0.windowAreaComponent.removeRearDisplayStatusListener(this.$rearDisplayListener);
            if (this.this$0.vendorApiLevel > 2) {
                this.this$0.windowAreaComponent.removeRearDisplayPresentationStatusListener(this.$rearDisplayPresentationListener);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowAreaControllerImpl$windowAreaInfos$1(WindowAreaControllerImpl windowAreaControllerImpl, o00O0O0O.OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.this$0 = windowAreaControllerImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(WindowAreaControllerImpl windowAreaControllerImpl, o00oOoo o00oooo, Integer status) {
        kotlin.jvm.internal.OooOo.OooO0Oo(status, "status");
        windowAreaControllerImpl.updateRearDisplayAvailability(status.intValue());
        o0O0ooO o0o0ooo = (o0O0ooO) o00oooo;
        o0o0ooo.getClass();
        Collection collectionValues = windowAreaControllerImpl.currentWindowAreaInfoMap.values();
        kotlin.jvm.internal.OooOo.OooO0Oo(collectionValues, "currentWindowAreaInfoMap.values");
        o0o0ooo.OooO(OooOo00.Oooo0o0(collectionValues));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(WindowAreaControllerImpl windowAreaControllerImpl, o00oOoo o00oooo, ExtensionWindowAreaStatus extensionWindowAreaStatus) {
        kotlin.jvm.internal.OooOo.OooO0Oo(extensionWindowAreaStatus, "extensionWindowAreaStatus");
        windowAreaControllerImpl.updateRearDisplayPresentationAvailability(extensionWindowAreaStatus);
        o0O0ooO o0o0ooo = (o0O0ooO) o00oooo;
        o0o0ooo.getClass();
        Collection collectionValues = windowAreaControllerImpl.currentWindowAreaInfoMap.values();
        kotlin.jvm.internal.OooOo.OooO0Oo(collectionValues, "currentWindowAreaInfoMap.values");
        o0o0ooo.OooO(OooOo00.Oooo0o0(collectionValues));
    }

    @Override // o00O0OO0.OooO00o
    public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
        WindowAreaControllerImpl$windowAreaInfos$1 windowAreaControllerImpl$windowAreaInfos$1 = new WindowAreaControllerImpl$windowAreaInfos$1(this.this$0, oooO0OO);
        windowAreaControllerImpl$windowAreaInfos$1.L$0 = obj;
        return windowAreaControllerImpl$windowAreaInfos$1;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
        int i = this.label;
        if (i == 0) {
            o000OOo.OooOO0O(obj);
            final o00oOoo o00oooo = (o00oOoo) this.L$0;
            final WindowAreaControllerImpl windowAreaControllerImpl = this.this$0;
            Consumer consumer = new Consumer() { // from class: androidx.window.area.OooO0OO
                @Override // androidx.window.extensions.core.util.function.Consumer
                public final void accept(Object obj2) {
                    WindowAreaControllerImpl$windowAreaInfos$1.invokeSuspend$lambda$0(windowAreaControllerImpl, o00oooo, (Integer) obj2);
                }
            };
            Consumer consumer2 = new Consumer() { // from class: androidx.window.area.OooO0o
                @Override // androidx.window.extensions.core.util.function.Consumer
                public final void accept(Object obj2) {
                    WindowAreaControllerImpl$windowAreaInfos$1.invokeSuspend$lambda$1(windowAreaControllerImpl, o00oooo, (ExtensionWindowAreaStatus) obj2);
                }
            };
            windowAreaControllerImpl.windowAreaComponent.addRearDisplayStatusListener(consumer);
            if (this.this$0.vendorApiLevel > 2) {
                this.this$0.windowAreaComponent.addRearDisplayPresentationStatusListener(consumer2);
            }
            C08351 c08351 = new C08351(this.this$0, consumer, consumer2);
            this.label = 1;
            if (o00O0O0O.OooO00o(o00oooo, c08351, this) == oooOo00) {
                return oooOo00;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
        }
        return OooOo.f33195OooO00o;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o00oOoo o00oooo, o00O0O0O.OooO0OO oooO0OO) {
        return ((WindowAreaControllerImpl$windowAreaInfos$1) create(o00oooo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
