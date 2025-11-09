package androidx.core.os;

import kotlin.jvm.internal.OooOO0O;

/* loaded from: classes.dex */
public abstract class BufferFillPolicy {
    public static final Companion Companion = new Companion(null);
    public static final BufferFillPolicy DISCARD = new Discard();
    public static final BufferFillPolicy RING_BUFFER = new RingBuffer();
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Discard extends BufferFillPolicy {
        public Discard() {
            super(1, null);
        }
    }

    public static final class RingBuffer extends BufferFillPolicy {
        public RingBuffer() {
            super(2, null);
        }
    }

    public /* synthetic */ BufferFillPolicy(int i, OooOO0O oooOO0O) {
        this(i);
    }

    public final int getValue$core_release() {
        return this.value;
    }

    private BufferFillPolicy(int i) {
        this.value = i;
    }
}
