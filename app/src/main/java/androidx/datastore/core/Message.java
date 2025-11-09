package androidx.datastore.core;

import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0O0O.OooOOO0;
import o00O0Oo.o00O0O;
import o00O0oOo.o00000;

/* loaded from: classes.dex */
public abstract class Message<T> {

    public static final class Read<T> extends Message<T> {
        private final State<T> lastState;

        public Read(State<T> state) {
            super(null);
            this.lastState = state;
        }

        @Override // androidx.datastore.core.Message
        public State<T> getLastState() {
            return this.lastState;
        }
    }

    public static final class Update<T> extends Message<T> {
        private final o00000 ack;
        private final OooOOO0 callerContext;
        private final State<T> lastState;
        private final o00O0O transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Update(o00O0O transform, o00000 ack, State<T> state, OooOOO0 callerContext) {
            super(null);
            OooOo.OooO0o0(transform, "transform");
            OooOo.OooO0o0(ack, "ack");
            OooOo.OooO0o0(callerContext, "callerContext");
            this.transform = transform;
            this.ack = ack;
            this.lastState = state;
            this.callerContext = callerContext;
        }

        public final o00000 getAck() {
            return this.ack;
        }

        public final OooOOO0 getCallerContext() {
            return this.callerContext;
        }

        @Override // androidx.datastore.core.Message
        public State<T> getLastState() {
            return this.lastState;
        }

        public final o00O0O getTransform() {
            return this.transform;
        }
    }

    public /* synthetic */ Message(OooOO0O oooOO0O) {
        this();
    }

    public abstract State<T> getLastState();

    private Message() {
    }
}
