package androidx.window.core;

import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;

/* loaded from: classes.dex */
final class ValidSpecification<T> extends SpecificationComputer<T> {
    private final Logger logger;
    private final String tag;
    private final T value;
    private final VerificationMode verificationMode;

    public ValidSpecification(T value, String tag, VerificationMode verificationMode, Logger logger) {
        OooOo.OooO0o0(value, "value");
        OooOo.OooO0o0(tag, "tag");
        OooOo.OooO0o0(verificationMode, "verificationMode");
        OooOo.OooO0o0(logger, "logger");
        this.value = value;
        this.tag = tag;
        this.verificationMode = verificationMode;
        this.logger = logger;
    }

    @Override // androidx.window.core.SpecificationComputer
    public T compute() {
        return this.value;
    }

    public final Logger getLogger() {
        return this.logger;
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
        return ((Boolean) condition.invoke(this.value)).booleanValue() ? this : new FailedSpecification(this.value, this.tag, message, this.logger, this.verificationMode);
    }
}
