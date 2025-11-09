package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.embedding.SplitController;
import java.util.List;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o000O00.o00O0O0O;
import o00O0.o000OOo;
import o00O0O0o.OooOo00;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oo.o00oOoo;
import o00O0oo.o0O0ooO;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;

/* loaded from: classes.dex */
public final class SplitController {
    public static final Companion Companion = new Companion(null);
    public static final boolean sDebug = false;
    private final EmbeddingBackend embeddingBackend;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        public final SplitController getInstance(Context context) {
            OooOo.OooO0o0(context, "context");
            return new SplitController(EmbeddingBackend.Companion.getInstance(context));
        }

        private Companion() {
        }
    }

    public static final class SplitSupportStatus {
        private final int rawValue;
        public static final Companion Companion = new Companion(null);
        public static final SplitSupportStatus SPLIT_AVAILABLE = new SplitSupportStatus(0);
        public static final SplitSupportStatus SPLIT_UNAVAILABLE = new SplitSupportStatus(1);
        public static final SplitSupportStatus SPLIT_ERROR_PROPERTY_NOT_DECLARED = new SplitSupportStatus(2);

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
                this();
            }

            private Companion() {
            }
        }

        private SplitSupportStatus(int i) {
            this.rawValue = i;
        }

        public String toString() {
            int i = this.rawValue;
            return i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "SplitSupportStatus: ERROR_SPLIT_PROPERTY_NOT_DECLARED" : "SplitSupportStatus: UNAVAILABLE" : "SplitSupportStatus: AVAILABLE";
        }
    }

    @o00O0OO0.OooO(m13471c = "androidx.window.embedding.SplitController$splitInfoList$1", m13472f = "SplitController.kt", m13473l = {64}, m13474m = "invokeSuspend")
    /* renamed from: androidx.window.embedding.SplitController$splitInfoList$1 */
    public static final class C08511 extends OooOOOO implements o00O0O {
        final /* synthetic */ Activity $activity;
        private /* synthetic */ Object L$0;
        int label;

        /* renamed from: androidx.window.embedding.SplitController$splitInfoList$1$2 */
        public static final class AnonymousClass2 extends Oooo000 implements o00O0Oo.OooO0O0 {
            final /* synthetic */ Consumer<List<SplitInfo>> $listener;
            final /* synthetic */ SplitController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(SplitController splitController, Consumer<List<SplitInfo>> consumer) {
                super(0);
                this.this$0 = splitController;
                this.$listener = consumer;
            }

            @Override // o00O0Oo.OooO0O0
            public /* bridge */ /* synthetic */ Object invoke() {
                m13538invoke();
                return oo00o.OooOo.f33195OooO00o;
            }

            /* renamed from: invoke */
            public final void m13538invoke() {
                this.this$0.embeddingBackend.removeSplitListenerForActivity(this.$listener);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08511(Activity activity, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$activity = activity;
        }

        public static final void invokeSuspend$lambda$0(o00oOoo o00oooo, List list) {
            ((o0O0ooO) o00oooo).OooO(list);
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            C08511 c08511 = SplitController.this.new C08511(this.$activity, oooO0OO);
            c08511.L$0 = obj;
            return c08511;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                final o00oOoo o00oooo = (o00oOoo) this.L$0;
                Consumer<List<SplitInfo>> consumer = new Consumer() { // from class: androidx.window.embedding.OooOO0O
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj2) {
                        SplitController.C08511.invokeSuspend$lambda$0(o00oooo, (List) obj2);
                    }
                };
                SplitController.this.embeddingBackend.addSplitListenerForActivity(this.$activity, new androidx.arch.core.executor.OooO00o(2), consumer);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(SplitController.this, consumer);
                this.label = 1;
                if (o00O0O0O.OooO00o(o00oooo, anonymousClass2, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o00oOoo o00oooo, o00O0O0O.OooO0OO oooO0OO) {
            return ((C08511) create(o00oooo, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }
    }

    public SplitController(EmbeddingBackend embeddingBackend) {
        OooOo.OooO0o0(embeddingBackend, "embeddingBackend");
        this.embeddingBackend = embeddingBackend;
    }

    public static final SplitController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public final void clearSplitAttributesCalculator() {
        this.embeddingBackend.clearSplitAttributesCalculator();
    }

    public final SplitSupportStatus getSplitSupportStatus() {
        return this.embeddingBackend.getSplitSupportStatus();
    }

    public final void invalidateTopVisibleSplitAttributes() {
        this.embeddingBackend.invalidateTopVisibleSplitAttributes();
    }

    public final void setSplitAttributesCalculator(o00O0Oo.Oooo000 calculator) {
        OooOo.OooO0o0(calculator, "calculator");
        this.embeddingBackend.setSplitAttributesCalculator(calculator);
    }

    public final o0OoOoOo splitInfoList(Activity activity) {
        OooOo.OooO0o0(activity, "activity");
        return o0o0000.OooO0oo(new C08511(activity, null));
    }

    public final void updateSplitAttributes(SplitInfo splitInfo, SplitAttributes splitAttributes) {
        OooOo.OooO0o0(splitInfo, "splitInfo");
        OooOo.OooO0o0(splitAttributes, "splitAttributes");
        this.embeddingBackend.updateSplitAttributes(splitInfo, splitAttributes);
    }
}
