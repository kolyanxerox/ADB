package androidx.datastore.core;

import com.google.android.gms.internal.ads.o0O0O00;
import com.google.android.gms.internal.measurement.o0OOO0;
import kotlin.jvm.internal.Oooo000;
import o00O0O0O.OooO0OO;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oOo.o00O0;
import o00O0oOo.o00O0O00;
import o00O0oo.o000O0;
import o00O0oo.o000O00O;
import o00O0oo.o000O0Oo;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class SimpleActor<T> {
    private final o00O0O consumeMessage;
    private final o000O00O messageQueue;
    private final AtomicInt remainingMessages;
    private final o000OO scope;

    /* renamed from: androidx.datastore.core.SimpleActor$1 */
    public static final class C03221 extends Oooo000 implements o00O0Oo.Oooo000 {
        final /* synthetic */ o00O0Oo.Oooo000 $onComplete;
        final /* synthetic */ o00O0O $onUndeliveredElement;
        final /* synthetic */ SimpleActor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03221(o00O0Oo.Oooo000 oooo000, SimpleActor<T> simpleActor, o00O0O o00o0o) {
            super(1);
            this.$onComplete = oooo000;
            this.this$0 = simpleActor;
            this.$onUndeliveredElement = o00o0o;
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return OooOo.f33195OooO00o;
        }

        public final void invoke(Throwable th) {
            OooOo oooOo;
            this.$onComplete.invoke(th);
            ((SimpleActor) this.this$0).messageQueue.OooOOO(th);
            do {
                Object objOooOO0o = ((SimpleActor) this.this$0).messageQueue.OooOO0o();
                oooOo = null;
                if (objOooOO0o instanceof o000O0Oo) {
                    objOooOO0o = null;
                }
                if (objOooOO0o != null) {
                    this.$onUndeliveredElement.invoke(objOooOO0o, th);
                    oooOo = OooOo.f33195OooO00o;
                }
            } while (oooOo != null);
        }
    }

    @OooO(m13471c = "androidx.datastore.core.SimpleActor$offer$2", m13472f = "SimpleActor.kt", m13473l = {121, 121}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.SimpleActor$offer$2 */
    public static final class C03232 extends OooOOOO implements o00O0O {
        Object L$0;
        int label;
        final /* synthetic */ SimpleActor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03232(SimpleActor<T> simpleActor, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.this$0 = simpleActor;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C03232(this.this$0, oooO0OO);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
        
            if (r1.invoke(r6, r5) != r0) goto L18;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[PHI: r1 r6
  0x0053: PHI (r1v1 o00O0Oo.o00O0O) = (r1v2 o00O0Oo.o00O0O), (r1v4 o00O0Oo.o00O0O) binds: [B:13:0x0050, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0053: PHI (r6v5 java.lang.Object) = (r6v13 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x0050, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005c -> B:18:0x005f). Please report as a decompilation issue!!! */
        @Override // o00O0OO0.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                o00O0.o000OOo.OooOO0O(r6)
                goto L5f
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                java.lang.Object r1 = r5.L$0
                o00O0Oo.o00O0O r1 = (o00O0Oo.o00O0O) r1
                o00O0.o000OOo.OooOO0O(r6)
                goto L53
            L20:
                o00O0.o000OOo.OooOO0O(r6)
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                androidx.datastore.core.AtomicInt r6 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r6)
                int r6 = r6.get()
                if (r6 <= 0) goto L6e
            L2f:
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                o00O0oOo.o000OO r6 = androidx.datastore.core.SimpleActor.access$getScope$p(r6)
                o00O0O0O.OooOOO0 r6 = r6.getCoroutineContext()
                o00O0oOo.o0000OO0.OooOO0o(r6)
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                o00O0Oo.o00O0O r1 = androidx.datastore.core.SimpleActor.access$getConsumeMessage$p(r6)
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                o00O0oo.o000O00O r6 = androidx.datastore.core.SimpleActor.access$getMessageQueue$p(r6)
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r6.OooO0Oo(r5)
                if (r6 != r0) goto L53
                goto L5e
            L53:
                r4 = 0
                r5.L$0 = r4
                r5.label = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L5f
            L5e:
                return r0
            L5f:
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                androidx.datastore.core.AtomicInt r6 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r6)
                int r6 = r6.decrementAndGet()
                if (r6 != 0) goto L2f
                oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
                return r6
            L6e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor.C03232.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C03232) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public SimpleActor(o000OO scope, o00O0Oo.Oooo000 onComplete, o00O0O onUndeliveredElement, o00O0O consumeMessage) {
        kotlin.jvm.internal.OooOo.OooO0o0(scope, "scope");
        kotlin.jvm.internal.OooOo.OooO0o0(onComplete, "onComplete");
        kotlin.jvm.internal.OooOo.OooO0o0(onUndeliveredElement, "onUndeliveredElement");
        kotlin.jvm.internal.OooOo.OooO0o0(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = o0OOO0.OooO00o(Integer.MAX_VALUE, 6, null);
        this.remainingMessages = new AtomicInt(0);
        o00O0O00 o00o0o00 = (o00O0O00) scope.getCoroutineContext().get(o00O0.f31523OooOo0O);
        if (o00o0o00 != null) {
            o00o0o00.OooO0oo(new C03221(onComplete, this, onUndeliveredElement));
        }
    }

    public final void offer(T t) {
        Object objOooO = this.messageQueue.OooO(t);
        if (objOooO instanceof o000O0) {
            o000O0 o000o0 = objOooO != null ? (o000O0) objOooO : null;
            Throwable th = o000o0 != null ? o000o0.f31609OooO00o : null;
            if (th != null) {
                throw th;
            }
            throw new o0O0O00("Channel was closed normally");
        }
        if (objOooO instanceof o000O0Oo) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.remainingMessages.getAndIncrement() == 0) {
            o0000OO0.OooOo0(this.scope, null, new C03232(this, null), 3);
        }
    }
}
