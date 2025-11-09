package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class o00000OO extends OoooO0.OooO0o implements o0000 {
    @Override // com.google.android.gms.internal.measurement.o0000
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelO000OO0O = o000OO0O();
        parcelO000OO0O.writeString(str);
        parcelO000OO0O.writeLong(j);
        o000O0O0(parcelO000OO0O, 23);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelO000OO0O = o000OO0O();
        parcelO000OO0O.writeString(str);
        parcelO000OO0O.writeString(str2);
        o0OO00O.OooO0O0(parcelO000OO0O, bundle);
        o000O0O0(parcelO000OO0O, 9);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelO000OO0O = o000OO0O();
        parcelO000OO0O.writeString(str);
        parcelO000OO0O.writeLong(j);
        o000O0O0(parcelO000OO0O, 24);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void generateEventId(o0000oo o0000ooVar) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0OO(parcelO000OO0O, o0000ooVar);
        o000O0O0(parcelO000OO0O, 22);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void getAppInstanceId(o0000oo o0000ooVar) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0OO(parcelO000OO0O, o0000ooVar);
        o000O0O0(parcelO000OO0O, 20);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void getCachedAppInstanceId(o0000oo o0000ooVar) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0OO(parcelO000OO0O, o0000ooVar);
        o000O0O0(parcelO000OO0O, 19);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void getConditionalUserProperties(String str, String str2, o0000oo o0000ooVar) {
        Parcel parcelO000OO0O = o000OO0O();
        parcelO000OO0O.writeString(str);
        parcelO000OO0O.writeString(str2);
        o0OO00O.OooO0OO(parcelO000OO0O, o0000ooVar);
        o000O0O0(parcelO000OO0O, 10);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void getCurrentScreenClass(o0000oo o0000ooVar) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0OO(parcelO000OO0O, o0000ooVar);
        o000O0O0(parcelO000OO0O, 17);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void getCurrentScreenName(o0000oo o0000ooVar) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0OO(parcelO000OO0O, o0000ooVar);
        o000O0O0(parcelO000OO0O, 16);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void getGmpAppId(o0000oo o0000ooVar) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0OO(parcelO000OO0O, o0000ooVar);
        o000O0O0(parcelO000OO0O, 21);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void getMaxUserProperties(String str, o0000oo o0000ooVar) {
        Parcel parcelO000OO0O = o000OO0O();
        parcelO000OO0O.writeString(str);
        o0OO00O.OooO0OO(parcelO000OO0O, o0000ooVar);
        o000O0O0(parcelO000OO0O, 6);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void getSessionId(o0000oo o0000ooVar) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0OO(parcelO000OO0O, o0000ooVar);
        o000O0O0(parcelO000OO0O, 46);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void getUserProperties(String str, String str2, boolean z, o0000oo o0000ooVar) {
        Parcel parcelO000OO0O = o000OO0O();
        parcelO000OO0O.writeString(str);
        parcelO000OO0O.writeString(str2);
        ClassLoader classLoader = o0OO00O.f26540OooO00o;
        parcelO000OO0O.writeInt(z ? 1 : 0);
        o0OO00O.OooO0OO(parcelO000OO0O, o0000ooVar);
        o000O0O0(parcelO000OO0O, 5);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void initialize(Oooo0o.OooO0O0 oooO0O0, o000O0o o000o0o2, long j) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0OO(parcelO000OO0O, oooO0O0);
        o0OO00O.OooO0O0(parcelO000OO0O, o000o0o2);
        parcelO000OO0O.writeLong(j);
        o000O0O0(parcelO000OO0O, 1);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel parcelO000OO0O = o000OO0O();
        parcelO000OO0O.writeString(str);
        parcelO000OO0O.writeString(str2);
        o0OO00O.OooO0O0(parcelO000OO0O, bundle);
        parcelO000OO0O.writeInt(z ? 1 : 0);
        parcelO000OO0O.writeInt(1);
        parcelO000OO0O.writeLong(j);
        o000O0O0(parcelO000OO0O, 2);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void logHealthData(int i, String str, Oooo0o.OooO0O0 oooO0O0, Oooo0o.OooO0O0 oooO0O02, Oooo0o.OooO0O0 oooO0O03) {
        Parcel parcelO000OO0O = o000OO0O();
        parcelO000OO0O.writeInt(5);
        parcelO000OO0O.writeString(str);
        o0OO00O.OooO0OO(parcelO000OO0O, oooO0O0);
        o0OO00O.OooO0OO(parcelO000OO0O, oooO0O02);
        o0OO00O.OooO0OO(parcelO000OO0O, oooO0O03);
        o000O0O0(parcelO000OO0O, 33);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void onActivityCreatedByScionActivityInfo(o000O00 o000o002, Bundle bundle, long j) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, o000o002);
        o0OO00O.OooO0O0(parcelO000OO0O, bundle);
        parcelO000OO0O.writeLong(j);
        o000O0O0(parcelO000OO0O, 53);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void onActivityDestroyedByScionActivityInfo(o000O00 o000o002, long j) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, o000o002);
        parcelO000OO0O.writeLong(j);
        o000O0O0(parcelO000OO0O, 54);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void onActivityPausedByScionActivityInfo(o000O00 o000o002, long j) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, o000o002);
        parcelO000OO0O.writeLong(j);
        o000O0O0(parcelO000OO0O, 55);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void onActivityResumedByScionActivityInfo(o000O00 o000o002, long j) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, o000o002);
        parcelO000OO0O.writeLong(j);
        o000O0O0(parcelO000OO0O, 56);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void onActivitySaveInstanceStateByScionActivityInfo(o000O00 o000o002, o0000oo o0000ooVar, long j) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, o000o002);
        o0OO00O.OooO0OO(parcelO000OO0O, o0000ooVar);
        parcelO000OO0O.writeLong(j);
        o000O0O0(parcelO000OO0O, 57);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void onActivityStartedByScionActivityInfo(o000O00 o000o002, long j) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, o000o002);
        parcelO000OO0O.writeLong(j);
        o000O0O0(parcelO000OO0O, 51);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void onActivityStoppedByScionActivityInfo(o000O00 o000o002, long j) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, o000o002);
        parcelO000OO0O.writeLong(j);
        o000O0O0(parcelO000OO0O, 52);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void performAction(Bundle bundle, o0000oo o0000ooVar, long j) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, bundle);
        o0OO00O.OooO0OO(parcelO000OO0O, o0000ooVar);
        parcelO000OO0O.writeLong(j);
        o000O0O0(parcelO000OO0O, 32);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void registerOnMeasurementEventListener(o0000OO0 o0000oo02) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0OO(parcelO000OO0O, o0000oo02);
        o000O0O0(parcelO000OO0O, 35);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void resetAnalyticsData(long j) {
        Parcel parcelO000OO0O = o000OO0O();
        parcelO000OO0O.writeLong(j);
        o000O0O0(parcelO000OO0O, 12);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void retrieveAndUploadBatches(o0000O0O o0000o0o2) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0OO(parcelO000OO0O, o0000o0o2);
        o000O0O0(parcelO000OO0O, 58);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, bundle);
        parcelO000OO0O.writeLong(j);
        o000O0O0(parcelO000OO0O, 8);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void setConsentThirdParty(Bundle bundle, long j) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, bundle);
        parcelO000OO0O.writeLong(j);
        o000O0O0(parcelO000OO0O, 45);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void setCurrentScreenByScionActivityInfo(o000O00 o000o002, String str, String str2, long j) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, o000o002);
        parcelO000OO0O.writeString(str);
        parcelO000OO0O.writeString(str2);
        parcelO000OO0O.writeLong(j);
        o000O0O0(parcelO000OO0O, 50);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void setDataCollectionEnabled(boolean z) {
        Parcel parcelO000OO0O = o000OO0O();
        ClassLoader classLoader = o0OO00O.f26540OooO00o;
        parcelO000OO0O.writeInt(z ? 1 : 0);
        o000O0O0(parcelO000OO0O, 39);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, bundle);
        o000O0O0(parcelO000OO0O, 42);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel parcelO000OO0O = o000OO0O();
        ClassLoader classLoader = o0OO00O.f26540OooO00o;
        parcelO000OO0O.writeInt(z ? 1 : 0);
        parcelO000OO0O.writeLong(j);
        o000O0O0(parcelO000OO0O, 11);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void setSessionTimeoutDuration(long j) {
        Parcel parcelO000OO0O = o000OO0O();
        parcelO000OO0O.writeLong(j);
        o000O0O0(parcelO000OO0O, 14);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void setSgtmDebugInfo(Intent intent) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, intent);
        o000O0O0(parcelO000OO0O, 48);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void setUserId(String str, long j) {
        Parcel parcelO000OO0O = o000OO0O();
        parcelO000OO0O.writeString(str);
        parcelO000OO0O.writeLong(j);
        o000O0O0(parcelO000OO0O, 7);
    }

    @Override // com.google.android.gms.internal.measurement.o0000
    public final void setUserProperty(String str, String str2, Oooo0o.OooO0O0 oooO0O0, boolean z, long j) {
        Parcel parcelO000OO0O = o000OO0O();
        parcelO000OO0O.writeString(str);
        parcelO000OO0O.writeString(str2);
        o0OO00O.OooO0OO(parcelO000OO0O, oooO0O0);
        parcelO000OO0O.writeInt(z ? 1 : 0);
        parcelO000OO0O.writeLong(j);
        o000O0O0(parcelO000OO0O, 4);
    }
}
