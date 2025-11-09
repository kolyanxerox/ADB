package com.unity3d.ads.core.data.datasource;

import android.database.ContentObserver;
import android.provider.Settings;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import com.unity3d.mediation.LevelPlayAdError;
import kotlin.jvm.internal.Oooo000;
import kotlin.jvm.internal.o00oO0o;
import kotlin.jvm.internal.o0ooOOo;
import o000O00.o00O0O0O;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.OooO0O0;
import o00O0Oo.o00O0O;
import o00O0oo.o00oOoo;
import oo00o.OooOo;

@OooO(m13471c = "com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1", m13472f = "AndroidDynamicDeviceInfoDataSource.kt", m13473l = {LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED}, m13474m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 extends OooOOOO implements o00O0O {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$1 */
    public static final class C40051 extends Oooo000 implements OooO0O0 {
        final /* synthetic */ C4006x3feaa35d $contentObserver;
        final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40051(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, C4006x3feaa35d c4006x3feaa35d) {
            super(0);
            this.this$0 = androidDynamicDeviceInfoDataSource;
            this.$contentObserver = c4006x3feaa35d;
        }

        @Override // o00O0Oo.OooO0O0
        public /* bridge */ /* synthetic */ Object invoke() {
            m13746invoke();
            return OooOo.f33195OooO00o;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m13746invoke() {
            this.this$0.getContext().getContentResolver().unregisterContentObserver(this.$contentObserver);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.this$0 = androidDynamicDeviceInfoDataSource;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1 = new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this.this$0, oooO0OO);
        androidDynamicDeviceInfoDataSource$volumeSettingsChange$1.L$0 = obj;
        return androidDynamicDeviceInfoDataSource$volumeSettingsChange$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.database.ContentObserver, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1] */
    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.label;
        if (i == 0) {
            o000OOo.OooOO0O(obj);
            final o00oOoo o00oooo = (o00oOoo) this.L$0;
            final o00oO0o o00oo0o = new o00oO0o();
            double streamVolume = this.this$0.getStreamVolume(3);
            o00oo0o.f28877OooOo0O = streamVolume;
            o000OOo.OooOO0o(o00oooo, new VolumeSettingsChange.VolumeChange(streamVolume));
            final o0ooOOo o0ooooo = new o0ooOOo();
            int ringerMode = this.this$0.getRingerMode();
            o0ooooo.f28882OooOo0O = ringerMode;
            o000OOo.OooOO0o(o00oooo, new VolumeSettingsChange.MuteChange(ringerMode == 0));
            final AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource = this.this$0;
            ?? r4 = new ContentObserver() { // from class: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(null);
                }

                @Override // android.database.ContentObserver
                public void onChange(boolean z) {
                    super.onChange(z);
                    double streamVolume2 = androidDynamicDeviceInfoDataSource.getStreamVolume(3);
                    o00oO0o o00oo0o2 = o00oo0o;
                    if (streamVolume2 != o00oo0o2.f28877OooOo0O) {
                        o00oo0o2.f28877OooOo0O = streamVolume2;
                        o000OOo.OooOO0o(o00oooo, new VolumeSettingsChange.VolumeChange(streamVolume2));
                    }
                    int ringerMode2 = androidDynamicDeviceInfoDataSource.getRingerMode();
                    o0ooOOo o0ooooo2 = o0ooooo;
                    if (ringerMode2 != o0ooooo2.f28882OooOo0O) {
                        o0ooooo2.f28882OooOo0O = ringerMode2;
                        o000OOo.OooOO0o(o00oooo, new VolumeSettingsChange.MuteChange(ringerMode2 == 0));
                    }
                }
            };
            this.this$0.getContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, r4);
            C40051 c40051 = new C40051(this.this$0, r4);
            this.label = 1;
            if (o00O0O0O.OooO00o(o00oooo, c40051, this) == oooOo00) {
                return oooOo00;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
        }
        return OooOo.f33195OooO00o;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o00oOoo o00oooo, OooO0OO oooO0OO) {
        return ((AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1) create(o00oooo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
