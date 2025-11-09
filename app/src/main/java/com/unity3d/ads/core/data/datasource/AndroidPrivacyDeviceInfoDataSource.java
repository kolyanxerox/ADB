package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.OpenAdvertisingId;
import gatewayprotocol.p014v1.AllowedPiiOuterClass;
import gatewayprotocol.p014v1.PiiKt;
import gatewayprotocol.p014v1.PiiOuterClass;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.o000oOoO;
import o00O0ooo.o0OO;
import o00O0ooo.o0o0000;
import o00O0ooo.oO00000o;

/* loaded from: classes3.dex */
public final class AndroidPrivacyDeviceInfoDataSource implements PrivacyDeviceInfoDataSource {
    private final Context context;
    private final FIdDataSource fIdDataSource;
    private final o0OO idfaInitialized;

    public AndroidPrivacyDeviceInfoDataSource(Context context, FIdDataSource fIdDataSource) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(fIdDataSource, "fIdDataSource");
        this.context = context;
        this.fIdDataSource = fIdDataSource;
        this.idfaInitialized = o0o0000.OooO0OO(Boolean.FALSE);
    }

    private final String getAdvertisingTrackingId() {
        String advertisingTrackingId = AdvertisingId.getAdvertisingTrackingId();
        return advertisingTrackingId == null ? "" : advertisingTrackingId;
    }

    private final String getOpenAdvertisingTrackingId() {
        String openAdvertisingTrackingId = OpenAdvertisingId.getOpenAdvertisingTrackingId();
        return openAdvertisingTrackingId == null ? "" : openAdvertisingTrackingId;
    }

    @Override // com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource
    public PiiOuterClass.Pii fetch(AllowedPiiOuterClass.AllowedPii allowed) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String strInvoke;
        OooOo.OooO0o0(allowed, "allowed");
        if (!((Boolean) ((oO00000o) this.idfaInitialized).getValue()).booleanValue()) {
            o0OO o0oo = this.idfaInitialized;
            Boolean bool = Boolean.TRUE;
            oO00000o oo00000o = (oO00000o) o0oo;
            oo00000o.getClass();
            oo00000o.OooO(null, bool);
            AdvertisingId.init(this.context);
            OpenAdvertisingId.init(this.context);
        }
        PiiKt.Dsl.Companion companion = PiiKt.Dsl.Companion;
        PiiOuterClass.Pii.Builder builderNewBuilder = PiiOuterClass.Pii.newBuilder();
        OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        final PiiKt.Dsl dsl_create = companion._create(builderNewBuilder);
        if (allowed.getIdfa()) {
            String advertisingTrackingId = getAdvertisingTrackingId();
            if (advertisingTrackingId.length() > 0) {
                UUID uuidFromString = UUID.fromString(advertisingTrackingId);
                OooOo.OooO0Oo(uuidFromString, "fromString(adId)");
                dsl_create.setAdvertisingId(ProtobufExtensionsKt.toByteString(uuidFromString));
            }
            String openAdvertisingTrackingId = getOpenAdvertisingTrackingId();
            if (openAdvertisingTrackingId.length() > 0) {
                UUID uuidFromString2 = UUID.fromString(openAdvertisingTrackingId);
                OooOo.OooO0Oo(uuidFromString2, "fromString(openAdId)");
                dsl_create.setOpenAdvertisingTrackingId(ProtobufExtensionsKt.toByteString(uuidFromString2));
            }
        }
        if (allowed.getFid() && (strInvoke = this.fIdDataSource.invoke()) != null) {
            String str = strInvoke.length() > 0 ? strInvoke : null;
            if (str != null) {
                new o000oOoO(dsl_create) { // from class: com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource$fetch$1$3
                    @Override // o00O0o0o.o000000O
                    public Object get() {
                        return ((PiiKt.Dsl) this.receiver).getFid();
                    }

                    @Override // o00O0o0o.o0O0O00
                    public void set(Object obj) {
                        ((PiiKt.Dsl) this.receiver).setFid((String) obj);
                    }
                }.set(str);
            }
        }
        return dsl_create._build();
    }
}
