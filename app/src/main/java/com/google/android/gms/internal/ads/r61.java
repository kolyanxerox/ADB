package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class r61 extends AudioDeviceCallback {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C1643hi f23783OooO00o;

    public /* synthetic */ r61(C1643hi c1643hi) {
        this.f23783OooO00o = c1643hi;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C1643hi c1643hi = this.f23783OooO00o;
        c1643hi.OooOO0(q61.OooO0O0((Context) c1643hi.f19786OooOo0O, (j50) c1643hi.f19793OooOooO, (pd0) c1643hi.f19791OooOoo));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C1643hi c1643hi = this.f23783OooO00o;
        pd0 pd0Var = (pd0) c1643hi.f19791OooOoo;
        int i = i80.f19994OooO00o;
        int length = audioDeviceInfoArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i2], pd0Var)) {
                c1643hi.f19791OooOoo = null;
                break;
            }
            i2++;
        }
        c1643hi.OooOO0(q61.OooO0O0((Context) c1643hi.f19786OooOo0O, (j50) c1643hi.f19793OooOooO, (pd0) c1643hi.f19791OooOoo));
    }
}
