package androidx.window.core;

import OooOOO0.OooO00o;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.OooOo;
import o00O0.OooOOO;
import o00O0.oo000o;
import o00O0Oo.Oooo000;

/* loaded from: classes.dex */
final class FailedSpecification<T> extends SpecificationComputer<T> {
    private final WindowStrictModeException exception;
    private final Logger logger;
    private final String message;
    private final String tag;
    private final T value;
    private final VerificationMode verificationMode;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationMode.values().length];
            try {
                iArr[VerificationMode.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationMode.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationMode.QUIET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FailedSpecification(T value, String tag, String message, Logger logger, VerificationMode verificationMode) {
        Collection collectionOooOO0o;
        OooOo.OooO0o0(value, "value");
        OooOo.OooO0o0(tag, "tag");
        OooOo.OooO0o0(message, "message");
        OooOo.OooO0o0(logger, "logger");
        OooOo.OooO0o0(verificationMode, "verificationMode");
        this.value = value;
        this.tag = tag;
        this.message = message;
        this.logger = logger;
        this.verificationMode = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(createMessage(value, message));
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        OooOo.OooO0Oo(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oO(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            collectionOooOO0o = oo000o.f31251OooOo0O;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collectionOooOO0o = OooOOO.OoooOOo(stackTrace);
            } else if (length == 1) {
                collectionOooOO0o = o0OO0O0.OooOO0o(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i = length2 - length; i < length2; i++) {
                    arrayList.add(stackTrace[i]);
                }
                collectionOooOO0o = arrayList;
            }
        }
        windowStrictModeException.setStackTrace((StackTraceElement[]) collectionOooOO0o.toArray(new StackTraceElement[0]));
        this.exception = windowStrictModeException;
    }

    @Override // androidx.window.core.SpecificationComputer
    public T compute() throws WindowStrictModeException {
        int i = WhenMappings.$EnumSwitchMapping$0[this.verificationMode.ordinal()];
        if (i == 1) {
            throw this.exception;
        }
        if (i == 2) {
            this.logger.debug(this.tag, createMessage(this.value, this.message));
            return null;
        }
        if (i == 3) {
            return null;
        }
        throw new OooO00o();
    }

    public final WindowStrictModeException getException() {
        return this.exception;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTag() {
        return this.tag;
    }

    public final T getValue() {
        return this.value;
    }

    public final VerificationMode getVerificationMode() {
        return this.verificationMode;
    }

    @Override // androidx.window.core.SpecificationComputer
    public SpecificationComputer<T> require(String message, Oooo000 condition) {
        OooOo.OooO0o0(message, "message");
        OooOo.OooO0o0(condition, "condition");
        return this;
    }
}
