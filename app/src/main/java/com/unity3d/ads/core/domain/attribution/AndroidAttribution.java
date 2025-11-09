package com.unity3d.ads.core.domain.attribution;

import Oooo0o0.OooO;
import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.p001os.OutcomeReceiver;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.customaudience.OooO00o;
import com.google.android.gms.internal.measurement.o0OOO0;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.jvm.internal.OooOo;
import o00O0O0O.OooOOOO;
import o00O0O0o.OooOo00;
import o00O0oOo.o0000OO0;
import o00O0ooo.InterfaceC4522o;
import oo00o.OooO0OO;

@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: classes3.dex */
public final class AndroidAttribution {
    private final ISDKDispatchers dispatchers;
    private final OooO0OO measurementManager$delegate;
    private final SessionRepository sessionRepository;

    public AndroidAttribution(Context context, ISDKDispatchers dispatchers, SessionRepository sessionRepository) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(dispatchers, "dispatchers");
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        this.dispatchers = dispatchers;
        this.sessionRepository = sessionRepository;
        this.measurementManager$delegate = o0OOO0.OooO0oo(new AndroidAttribution$measurementManager$2(this, context));
    }

    private final MeasurementManager getMeasurementManager() {
        return OooO00o.OooOOO0(this.measurementManager$delegate.getValue());
    }

    private final Uri getUri(String str, AdObject adObject) {
        Uri uri = Uri.parse(str);
        OooOo.OooO0Oo(uri, "parse(this)");
        Uri uriBuild = uri.buildUpon().appendQueryParameter("sessionToken", ProtobufExtensionsKt.toBase64$default(this.sessionRepository.getSessionToken(), false, 1, null)).appendQueryParameter(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null)).build();
        OooOo.OooO0Oo(uriBuild, "baseUrl.toUri()\n        …4())\n            .build()");
        return uriBuild;
    }

    public final Object isAvailable(o00O0O0O.OooO0OO oooO0OO) throws Throwable {
        oo00o.OooOo oooOo;
        if (Device.getApiLevel() < 33) {
            return Boolean.FALSE;
        }
        if (SdkExtensions.getExtensionVersion(1000000) < 4) {
            return Boolean.FALSE;
        }
        if (getMeasurementManager() == null) {
            return Boolean.FALSE;
        }
        if (!AdServicesState.isAdServicesStateEnabled()) {
            return Boolean.FALSE;
        }
        final OooOOOO oooOOOO = new OooOOOO(OooO.OooOOOO(oooO0OO));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.getMeasurementApiStatus(o0000OO0.OooO0o(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$isAvailable$2$1
                public /* bridge */ /* synthetic */ void onResult(Object obj) {
                    onResult(((Number) obj).intValue());
                }

                public void onError(Exception error) {
                    OooOo.OooO0o0(error, "error");
                    oooOOOO.resumeWith(Boolean.FALSE);
                }

                public void onResult(int i) {
                    oooOOOO.resumeWith(Boolean.valueOf(i == 1));
                }
            });
            oooOo = oo00o.OooOo.f33195OooO00o;
        } else {
            oooOo = null;
        }
        if (oooOo == null) {
            oooOOOO.resumeWith(Boolean.FALSE);
        }
        Object objOooO00o = oooOOOO.OooO00o();
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        return objOooO00o;
    }

    public final Object registerClick(String str, AdObject adObject, o00O0O0O.OooO0OO oooO0OO) throws Throwable {
        WebViewContainer webViewContainer;
        InterfaceC4522o lastInputEvent;
        InputEvent inputEvent;
        oo00o.OooOo oooOo;
        if (getMeasurementManager() == null) {
            return Boolean.FALSE;
        }
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (webViewContainer = adPlayer.getWebViewContainer()) == null || (lastInputEvent = webViewContainer.getLastInputEvent()) == null || (inputEvent = (InputEvent) lastInputEvent.getValue()) == null) {
            return Boolean.FALSE;
        }
        final OooOOOO oooOOOO = new OooOOOO(OooO.OooOOOO(oooO0OO));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), inputEvent, o0000OO0.OooO0o(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerClick$2$1
                public void onResult(Object p0) {
                    OooOo.OooO0o0(p0, "p0");
                    oooOOOO.resumeWith(Boolean.TRUE);
                }

                public void onError(Exception error) {
                    OooOo.OooO0o0(error, "error");
                    oooOOOO.resumeWith(Boolean.FALSE);
                }
            });
            oooOo = oo00o.OooOo.f33195OooO00o;
        } else {
            oooOo = null;
        }
        if (oooOo == null) {
            oooOOOO.resumeWith(Boolean.FALSE);
        }
        Object objOooO00o = oooOOOO.OooO00o();
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        return objOooO00o;
    }

    public final Object registerView(String str, AdObject adObject, o00O0O0O.OooO0OO oooO0OO) throws Throwable {
        oo00o.OooOo oooOo;
        if (getMeasurementManager() == null) {
            return Boolean.FALSE;
        }
        final OooOOOO oooOOOO = new OooOOOO(OooO.OooOOOO(oooO0OO));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), null, o0000OO0.OooO0o(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerView$2$1
                public void onResult(Object p0) {
                    OooOo.OooO0o0(p0, "p0");
                    oooOOOO.resumeWith(Boolean.TRUE);
                }

                public void onError(Exception error) {
                    OooOo.OooO0o0(error, "error");
                    oooOOOO.resumeWith(Boolean.FALSE);
                }
            });
            oooOo = oo00o.OooOo.f33195OooO00o;
        } else {
            oooOo = null;
        }
        if (oooOo == null) {
            oooOOOO.resumeWith(Boolean.FALSE);
        }
        Object objOooO00o = oooOOOO.OooO00o();
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        return objOooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasurementManager getMeasurementManager(Context context) {
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return OooO00o.OooOOO0(context.getSystemService(OooO00o.OooOOo()));
        }
        return null;
    }
}
