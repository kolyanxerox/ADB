package androidx.window.core;

import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;

/* loaded from: classes.dex */
public abstract class SpecificationComputer<T> {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public static /* synthetic */ SpecificationComputer startSpecification$default(Companion companion, Object obj, String str, VerificationMode verificationMode, Logger logger, int i, Object obj2) {
            if ((i & 2) != 0) {
                verificationMode = BuildConfig.INSTANCE.getVerificationMode();
            }
            if ((i & 4) != 0) {
                logger = AndroidLogger.INSTANCE;
            }
            return companion.startSpecification(obj, str, verificationMode, logger);
        }

        public final <T> SpecificationComputer<T> startSpecification(T t, String tag, VerificationMode verificationMode, Logger logger) {
            OooOo.OooO0o0(t, "<this>");
            OooOo.OooO0o0(tag, "tag");
            OooOo.OooO0o0(verificationMode, "verificationMode");
            OooOo.OooO0o0(logger, "logger");
            return new ValidSpecification(t, tag, verificationMode, logger);
        }

        private Companion() {
        }
    }

    public abstract T compute();

    public final String createMessage(Object value, String message) {
        OooOo.OooO0o0(value, "value");
        OooOo.OooO0o0(message, "message");
        return message + " value: " + value;
    }

    public abstract SpecificationComputer<T> require(String str, Oooo000 oooo000);
}
