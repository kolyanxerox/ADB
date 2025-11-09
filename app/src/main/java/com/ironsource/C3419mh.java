package com.ironsource;

/* renamed from: com.ironsource.mh */
/* loaded from: classes2.dex */
public class C3419mh {

    /* renamed from: com.ironsource.mh$a */
    public enum a {
        None,
        Device,
        Controller
    }

    /* renamed from: com.ironsource.mh$b */
    public enum b {
        None,
        Loading,
        Loaded,
        Ready,
        Failed
    }

    /* renamed from: com.ironsource.mh$c */
    public enum c {
        Web,
        Native,
        None
    }

    /* renamed from: com.ironsource.mh$d */
    public enum d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);


        /* renamed from: a */
        private int f10282a;

        d(int i) {
            this.f10282a = i;
        }

        /* renamed from: a */
        public int m10813a() {
            return this.f10282a;
        }
    }

    /* renamed from: com.ironsource.mh$e */
    public enum e {
        Banner,
        Interstitial,
        RewardedVideo,
        NativeAd,
        None
    }
}
