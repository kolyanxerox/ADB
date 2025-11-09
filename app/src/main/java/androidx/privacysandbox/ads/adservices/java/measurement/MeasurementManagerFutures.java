package androidx.privacysandbox.ads.adservices.java.measurement;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.measurement.DeletionRequest;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManager;
import androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest;
import androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest;
import androidx.privacysandbox.ads.adservices.measurement.WebTriggerRegistrationRequest;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00000oO.OooOOO;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0O0;

/* loaded from: classes.dex */
public abstract class MeasurementManagerFutures {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public final MeasurementManagerFutures from(Context context) {
            OooOo.OooO0o0(context, "context");
            MeasurementManager measurementManagerObtain = MeasurementManager.Companion.obtain(context);
            if (measurementManagerObtain != null) {
                return new Api33Ext5JavaImpl(measurementManagerObtain);
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final MeasurementManagerFutures from(Context context) {
        return Companion.from(context);
    }

    public abstract OooOOO deleteRegistrationsAsync(DeletionRequest deletionRequest);

    public abstract OooOOO getMeasurementApiStatusAsync();

    public abstract OooOOO registerSourceAsync(Uri uri, InputEvent inputEvent);

    @ExperimentalFeatures.RegisterSourceOptIn
    public abstract OooOOO registerSourceAsync(SourceRegistrationRequest sourceRegistrationRequest);

    public abstract OooOOO registerTriggerAsync(Uri uri);

    public abstract OooOOO registerWebSourceAsync(WebSourceRegistrationRequest webSourceRegistrationRequest);

    public abstract OooOOO registerWebTriggerAsync(WebTriggerRegistrationRequest webTriggerRegistrationRequest);

    public static final class Api33Ext5JavaImpl extends MeasurementManagerFutures {
        private final MeasurementManager mMeasurementManager;

        public Api33Ext5JavaImpl(MeasurementManager mMeasurementManager) {
            OooOo.OooO0o0(mMeasurementManager, "mMeasurementManager");
            this.mMeasurementManager = mMeasurementManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public OooOOO deleteRegistrationsAsync(DeletionRequest deletionRequest) {
            OooOo.OooO0o0(deletionRequest, "deletionRequest");
            return CoroutineAdapterKt.asListenableFuture$default(o0000OO0.OooO0oO(o0000OO0.OooO0O0(o000O0O0.f31514OooO00o), new C0637x759ed5b3(this, deletionRequest, null)), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public OooOOO getMeasurementApiStatusAsync() {
            return CoroutineAdapterKt.asListenableFuture$default(o0000OO0.OooO0oO(o0000OO0.OooO0O0(o000O0O0.f31514OooO00o), new C0638x3feaa97c(this, null)), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public OooOOO registerSourceAsync(Uri attributionSource, InputEvent inputEvent) {
            OooOo.OooO0o0(attributionSource, "attributionSource");
            return CoroutineAdapterKt.asListenableFuture$default(o0000OO0.OooO0oO(o0000OO0.OooO0O0(o000O0O0.f31514OooO00o), new C0639x2c3ae252(this, attributionSource, inputEvent, null)), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public OooOOO registerTriggerAsync(Uri trigger) {
            OooOo.OooO0o0(trigger, "trigger");
            return CoroutineAdapterKt.asListenableFuture$default(o0000OO0.OooO0oO(o0000OO0.OooO0O0(o000O0O0.f31514OooO00o), new C0641x9b0c78cd(this, trigger, null)), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public OooOOO registerWebSourceAsync(WebSourceRegistrationRequest request) {
            OooOo.OooO0o0(request, "request");
            return CoroutineAdapterKt.asListenableFuture$default(o0000OO0.OooO0oO(o0000OO0.OooO0O0(o000O0O0.f31514OooO00o), new C0642x5537f716(this, request, null)), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public OooOOO registerWebTriggerAsync(WebTriggerRegistrationRequest request) {
            OooOo.OooO0o0(request, "request");
            return CoroutineAdapterKt.asListenableFuture$default(o0000OO0.OooO0oO(o0000OO0.OooO0O0(o000O0O0.f31514OooO00o), new C0643x91b1fc89(this, request, null)), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @ExperimentalFeatures.RegisterSourceOptIn
        public OooOOO registerSourceAsync(SourceRegistrationRequest request) {
            OooOo.OooO0o0(request, "request");
            return CoroutineAdapterKt.asListenableFuture$default(o0000OO0.OooO0oO(o0000OO0.OooO0O0(o000O0O0.f31514OooO00o), new C0640x2c3ae253(this, request, null)), null, 1, null);
        }
    }
}
