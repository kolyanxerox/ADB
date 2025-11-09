package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class o0000Ooo extends o0Oo0oo implements o0000 {
    public static o0000 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof o0000 ? (o0000) iInterfaceQueryLocalInterface : new o00000OO(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 2);
    }

    @Override // com.google.android.gms.internal.measurement.o0Oo0oo
    public final boolean OooO(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        o0000oo o0000o00 = null;
        o0000O0O o0000o02 = null;
        o0000oo o0000o002 = null;
        o0000oo o0000o003 = null;
        o0000oo o0000o004 = null;
        o0000oo o0000o005 = null;
        o0000OO0 o000oo2 = null;
        o0000OO0 o000oo3 = null;
        o0000OO0 o000oo4 = null;
        o0000oo o0000o006 = null;
        o0000oo o0000o007 = null;
        o0000oo o0000o008 = null;
        o0000oo o0000o009 = null;
        o0000oo o0000o0010 = null;
        o0000oo o0000o0011 = null;
        o000O000 o000Var = null;
        o0000oo o0000o0012 = null;
        o0000oo o0000o0013 = null;
        o0000oo o0000o0014 = null;
        o0000oo o0000o0015 = null;
        o0000oo o0000o0016 = null;
        switch (i) {
            case 1:
                Oooo0o.OooO0O0 oooO0O0O000O0o0 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                o000O0o o000o0o2 = (o000O0o) o0OO00O.OooO00o(parcel, o000O0o.CREATOR);
                long j = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                initialize(oooO0O0O000O0o0, o000o0o2, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) o0OO00O.OooO00o(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z = false;
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = parcel.readInt() != 0 ? true : z;
                long j2 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                logEvent(string, string2, bundle, z, z2, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) o0OO00O.OooO00o(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    o0000o00 = iInterfaceQueryLocalInterface instanceof o0000oo ? (o0000oo) iInterfaceQueryLocalInterface : new o0000O00(strongBinder);
                }
                o0000oo o0000ooVar = o0000o00;
                long j3 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                logEventAndBundle(string3, string4, bundle2, o0000ooVar, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                Oooo0o.OooO0O0 oooO0O0O000O0o02 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                ClassLoader classLoader = o0OO00O.f26540OooO00o;
                z = parcel.readInt() != 0;
                long j4 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                setUserProperty(string5, string6, oooO0O0O000O0o02, z, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = o0OO00O.f26540OooO00o;
                z = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    o0000o0016 = iInterfaceQueryLocalInterface2 instanceof o0000oo ? (o0000oo) iInterfaceQueryLocalInterface2 : new o0000O00(strongBinder2);
                }
                o0OO00O.OooO0Oo(parcel);
                getUserProperties(string7, string8, z, o0000o0016);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    o0000o0015 = iInterfaceQueryLocalInterface3 instanceof o0000oo ? (o0000oo) iInterfaceQueryLocalInterface3 : new o0000O00(strongBinder3);
                }
                o0OO00O.OooO0Oo(parcel);
                getMaxUserProperties(string9, o0000o0015);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) o0OO00O.OooO00o(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) o0OO00O.OooO00o(parcel, Bundle.CREATOR);
                o0OO00O.OooO0Oo(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    o0000o0014 = iInterfaceQueryLocalInterface4 instanceof o0000oo ? (o0000oo) iInterfaceQueryLocalInterface4 : new o0000O00(strongBinder4);
                }
                o0OO00O.OooO0Oo(parcel);
                getConditionalUserProperties(string13, string14, o0000o0014);
                break;
            case 11:
                ClassLoader classLoader3 = o0OO00O.f26540OooO00o;
                z = parcel.readInt() != 0;
                long j7 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                setMeasurementEnabled(z, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                Oooo0o.OooO0O0 oooO0O0O000O0o03 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                setCurrentScreen(oooO0O0O000O0o03, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    o0000o0013 = iInterfaceQueryLocalInterface5 instanceof o0000oo ? (o0000oo) iInterfaceQueryLocalInterface5 : new o0000O00(strongBinder5);
                }
                o0OO00O.OooO0Oo(parcel);
                getCurrentScreenName(o0000o0013);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    o0000o0012 = iInterfaceQueryLocalInterface6 instanceof o0000oo ? (o0000oo) iInterfaceQueryLocalInterface6 : new o0000O00(strongBinder6);
                }
                o0OO00O.OooO0Oo(parcel);
                getCurrentScreenClass(o0000o0012);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    o000Var = iInterfaceQueryLocalInterface7 instanceof o000O000 ? (o000O000) iInterfaceQueryLocalInterface7 : new o000(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 2);
                }
                o0OO00O.OooO0Oo(parcel);
                setInstanceIdProvider(o000Var);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    o0000o0011 = iInterfaceQueryLocalInterface8 instanceof o0000oo ? (o0000oo) iInterfaceQueryLocalInterface8 : new o0000O00(strongBinder8);
                }
                o0OO00O.OooO0Oo(parcel);
                getCachedAppInstanceId(o0000o0011);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    o0000o0010 = iInterfaceQueryLocalInterface9 instanceof o0000oo ? (o0000oo) iInterfaceQueryLocalInterface9 : new o0000O00(strongBinder9);
                }
                o0OO00O.OooO0Oo(parcel);
                getAppInstanceId(o0000o0010);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    o0000o009 = iInterfaceQueryLocalInterface10 instanceof o0000oo ? (o0000oo) iInterfaceQueryLocalInterface10 : new o0000O00(strongBinder10);
                }
                o0OO00O.OooO0Oo(parcel);
                getGmpAppId(o0000o009);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    o0000o008 = iInterfaceQueryLocalInterface11 instanceof o0000oo ? (o0000oo) iInterfaceQueryLocalInterface11 : new o0000O00(strongBinder11);
                }
                o0OO00O.OooO0Oo(parcel);
                generateEventId(o0000o008);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                Oooo0o.OooO0O0 oooO0O0O000O0o04 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                onActivityStarted(oooO0O0O000O0o04, j14);
                break;
            case 26:
                Oooo0o.OooO0O0 oooO0O0O000O0o05 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                onActivityStopped(oooO0O0O000O0o05, j15);
                break;
            case 27:
                Oooo0o.OooO0O0 oooO0O0O000O0o06 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) o0OO00O.OooO00o(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                onActivityCreated(oooO0O0O000O0o06, bundle5, j16);
                break;
            case 28:
                Oooo0o.OooO0O0 oooO0O0O000O0o07 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                onActivityDestroyed(oooO0O0O000O0o07, j17);
                break;
            case 29:
                Oooo0o.OooO0O0 oooO0O0O000O0o08 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                onActivityPaused(oooO0O0O000O0o08, j18);
                break;
            case 30:
                Oooo0o.OooO0O0 oooO0O0O000O0o09 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                onActivityResumed(oooO0O0O000O0o09, j19);
                break;
            case 31:
                Oooo0o.OooO0O0 oooO0O0O000O0o010 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    o0000o007 = iInterfaceQueryLocalInterface12 instanceof o0000oo ? (o0000oo) iInterfaceQueryLocalInterface12 : new o0000O00(strongBinder12);
                }
                long j20 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                onActivitySaveInstanceState(oooO0O0O000O0o010, o0000o007, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) o0OO00O.OooO00o(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    o0000o006 = iInterfaceQueryLocalInterface13 instanceof o0000oo ? (o0000oo) iInterfaceQueryLocalInterface13 : new o0000O00(strongBinder13);
                }
                long j21 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                performAction(bundle6, o0000o006, j21);
                break;
            case 33:
                int i2 = parcel.readInt();
                String string19 = parcel.readString();
                Oooo0o.OooO0O0 oooO0O0O000O0o011 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                Oooo0o.OooO0O0 oooO0O0O000O0o012 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                Oooo0o.OooO0O0 oooO0O0O000O0o013 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                o0OO00O.OooO0Oo(parcel);
                logHealthData(i2, string19, oooO0O0O000O0o011, oooO0O0O000O0o012, oooO0O0O000O0o013);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    o000oo4 = iInterfaceQueryLocalInterface14 instanceof o0000OO0 ? (o0000OO0) iInterfaceQueryLocalInterface14 : new o000OO(strongBinder14);
                }
                o0OO00O.OooO0Oo(parcel);
                setEventInterceptor(o000oo4);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    o000oo3 = iInterfaceQueryLocalInterface15 instanceof o0000OO0 ? (o0000OO0) iInterfaceQueryLocalInterface15 : new o000OO(strongBinder15);
                }
                o0OO00O.OooO0Oo(parcel);
                registerOnMeasurementEventListener(o000oo3);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    o000oo2 = iInterfaceQueryLocalInterface16 instanceof o0000OO0 ? (o0000OO0) iInterfaceQueryLocalInterface16 : new o000OO(strongBinder16);
                }
                o0OO00O.OooO0Oo(parcel);
                unregisterOnMeasurementEventListener(o000oo2);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(o0OO00O.f26540OooO00o);
                o0OO00O.OooO0Oo(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    o0000o005 = iInterfaceQueryLocalInterface17 instanceof o0000oo ? (o0000oo) iInterfaceQueryLocalInterface17 : new o0000O00(strongBinder17);
                }
                int i3 = parcel.readInt();
                o0OO00O.OooO0Oo(parcel);
                getTestFlag(o0000o005, i3);
                break;
            case 39:
                ClassLoader classLoader4 = o0OO00O.f26540OooO00o;
                z = parcel.readInt() != 0;
                o0OO00O.OooO0Oo(parcel);
                setDataCollectionEnabled(z);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    o0000o004 = iInterfaceQueryLocalInterface18 instanceof o0000oo ? (o0000oo) iInterfaceQueryLocalInterface18 : new o0000O00(strongBinder18);
                }
                o0OO00O.OooO0Oo(parcel);
                isDataCollectionEnabled(o0000o004);
                break;
            case 41:
            case 47:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) o0OO00O.OooO00o(parcel, Bundle.CREATOR);
                o0OO00O.OooO0Oo(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                clearMeasurementEnabled(j22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) o0OO00O.OooO00o(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                setConsent(bundle8, j23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) o0OO00O.OooO00o(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    o0000o003 = iInterfaceQueryLocalInterface19 instanceof o0000oo ? (o0000oo) iInterfaceQueryLocalInterface19 : new o0000O00(strongBinder19);
                }
                o0OO00O.OooO0Oo(parcel);
                getSessionId(o0000o003);
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                Intent intent = (Intent) o0OO00O.OooO00o(parcel, Intent.CREATOR);
                o0OO00O.OooO0Oo(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                o000O00 o000o002 = (o000O00) o0OO00O.OooO00o(parcel, o000O00.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j25 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                setCurrentScreenByScionActivityInfo(o000o002, string20, string21, j25);
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                o000O00 o000o003 = (o000O00) o0OO00O.OooO00o(parcel, o000O00.CREATOR);
                long j26 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                onActivityStartedByScionActivityInfo(o000o003, j26);
                break;
            case 52:
                o000O00 o000o004 = (o000O00) o0OO00O.OooO00o(parcel, o000O00.CREATOR);
                long j27 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                onActivityStoppedByScionActivityInfo(o000o004, j27);
                break;
            case 53:
                o000O00 o000o005 = (o000O00) o0OO00O.OooO00o(parcel, o000O00.CREATOR);
                Bundle bundle10 = (Bundle) o0OO00O.OooO00o(parcel, Bundle.CREATOR);
                long j28 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                onActivityCreatedByScionActivityInfo(o000o005, bundle10, j28);
                break;
            case 54:
                o000O00 o000o006 = (o000O00) o0OO00O.OooO00o(parcel, o000O00.CREATOR);
                long j29 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                onActivityDestroyedByScionActivityInfo(o000o006, j29);
                break;
            case 55:
                o000O00 o000o007 = (o000O00) o0OO00O.OooO00o(parcel, o000O00.CREATOR);
                long j30 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                onActivityPausedByScionActivityInfo(o000o007, j30);
                break;
            case 56:
                o000O00 o000o008 = (o000O00) o0OO00O.OooO00o(parcel, o000O00.CREATOR);
                long j31 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                onActivityResumedByScionActivityInfo(o000o008, j31);
                break;
            case 57:
                o000O00 o000o009 = (o000O00) o0OO00O.OooO00o(parcel, o000O00.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    o0000o002 = iInterfaceQueryLocalInterface20 instanceof o0000oo ? (o0000oo) iInterfaceQueryLocalInterface20 : new o0000O00(strongBinder20);
                }
                long j32 = parcel.readLong();
                o0OO00O.OooO0Oo(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(o000o009, o0000o002, j32);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    o0000o02 = iInterfaceQueryLocalInterface21 instanceof o0000O0O ? (o0000O0O) iInterfaceQueryLocalInterface21 : new o0000O0(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 2);
                }
                o0OO00O.OooO0Oo(parcel);
                retrieveAndUploadBatches(o0000o02);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
