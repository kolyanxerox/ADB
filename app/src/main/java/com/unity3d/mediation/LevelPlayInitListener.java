package com.unity3d.mediation;

/* loaded from: classes3.dex */
public interface LevelPlayInitListener {
    void onInitFailed(LevelPlayInitError levelPlayInitError);

    void onInitSuccess(LevelPlayConfiguration levelPlayConfiguration);
}
