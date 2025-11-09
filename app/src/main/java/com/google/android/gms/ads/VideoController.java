package com.google.android.gms.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzfz;
import com.google.android.gms.ads.internal.util.client.zzo;

/* loaded from: classes2.dex */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;

    /* renamed from: OooO00o */
    public final Object f15922OooO00o = new Object();

    /* renamed from: OooO0O0 */
    public zzeb f15923OooO0O0;

    /* renamed from: OooO0OO */
    public VideoLifecycleCallbacks f15924OooO0OO;

    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public int getPlaybackState() {
        synchronized (this.f15922OooO00o) {
            zzeb zzebVar = this.f15923OooO0O0;
            if (zzebVar == null) {
                return 0;
            }
            try {
                return zzebVar.zzh();
            } catch (RemoteException e) {
                zzo.zzh("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    @Nullable
    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.f15922OooO00o) {
            videoLifecycleCallbacks = this.f15924OooO0OO;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z;
        synchronized (this.f15922OooO00o) {
            z = this.f15923OooO0O0 != null;
        }
        return z;
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.f15922OooO00o) {
            zzeb zzebVar = this.f15923OooO0O0;
            if (zzebVar == null) {
                return false;
            }
            try {
                return zzebVar.zzo();
            } catch (RemoteException e) {
                zzo.zzh("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.f15922OooO00o) {
            zzeb zzebVar = this.f15923OooO0O0;
            if (zzebVar == null) {
                return false;
            }
            try {
                return zzebVar.zzp();
            } catch (RemoteException e) {
                zzo.zzh("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.f15922OooO00o) {
            zzeb zzebVar = this.f15923OooO0O0;
            if (zzebVar == null) {
                return true;
            }
            try {
                return zzebVar.zzq();
            } catch (RemoteException e) {
                zzo.zzh("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    public void mute(boolean z) {
        synchronized (this.f15922OooO00o) {
            zzeb zzebVar = this.f15923OooO0O0;
            if (zzebVar == null) {
                return;
            }
            try {
                zzebVar.zzj(z);
            } catch (RemoteException e) {
                zzo.zzh("Unable to call mute on video controller.", e);
            }
        }
    }

    public void pause() {
        synchronized (this.f15922OooO00o) {
            zzeb zzebVar = this.f15923OooO0O0;
            if (zzebVar == null) {
                return;
            }
            try {
                zzebVar.zzk();
            } catch (RemoteException e) {
                zzo.zzh("Unable to call pause on video controller.", e);
            }
        }
    }

    public void play() {
        synchronized (this.f15922OooO00o) {
            zzeb zzebVar = this.f15923OooO0O0;
            if (zzebVar == null) {
                return;
            }
            try {
                zzebVar.zzl();
            } catch (RemoteException e) {
                zzo.zzh("Unable to call play on video controller.", e);
            }
        }
    }

    public void setVideoLifecycleCallbacks(@Nullable VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzfz zzfzVar;
        synchronized (this.f15922OooO00o) {
            this.f15924OooO0OO = videoLifecycleCallbacks;
            zzeb zzebVar = this.f15923OooO0O0;
            if (zzebVar == null) {
                return;
            }
            if (videoLifecycleCallbacks == null) {
                zzfzVar = null;
            } else {
                try {
                    zzfzVar = new zzfz(videoLifecycleCallbacks);
                } catch (RemoteException e) {
                    zzo.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
            zzebVar.zzm(zzfzVar);
        }
    }

    public void stop() {
        synchronized (this.f15922OooO00o) {
            zzeb zzebVar = this.f15923OooO0O0;
            if (zzebVar == null) {
                return;
            }
            try {
                zzebVar.zzn();
            } catch (RemoteException e) {
                zzo.zzh("Unable to call stop on video controller.", e);
            }
        }
    }

    @Nullable
    public final zzeb zza() {
        zzeb zzebVar;
        synchronized (this.f15922OooO00o) {
            zzebVar = this.f15923OooO0O0;
        }
        return zzebVar;
    }

    public final void zzb(@Nullable zzeb zzebVar) {
        synchronized (this.f15922OooO00o) {
            try {
                this.f15923OooO0O0 = zzebVar;
                VideoLifecycleCallbacks videoLifecycleCallbacks = this.f15924OooO0OO;
                if (videoLifecycleCallbacks != null) {
                    setVideoLifecycleCallbacks(videoLifecycleCallbacks);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
