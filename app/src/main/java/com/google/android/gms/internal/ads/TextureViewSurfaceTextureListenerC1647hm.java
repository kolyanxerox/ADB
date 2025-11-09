package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.HashMap;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: com.google.android.gms.internal.ads.hm */
/* loaded from: classes2.dex */
public final class TextureViewSurfaceTextureListenerC1647hm extends AbstractC1684im implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: Oooo0oO, reason: collision with root package name */
    public static final HashMap f19810Oooo0oO;

    /* renamed from: OooOo, reason: collision with root package name */
    public final C2129uo f19811OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final boolean f19812OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final C2090tm f19813OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public int f19814OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public MediaPlayer f19815OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public int f19816OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public Uri f19817OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public int f19818OooOooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public final boolean f19819Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public int f19820Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public int f19821Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public C2016rm f19822Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public int f19823Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public C1831mm f19824Oooo0OO;

    /* renamed from: Oooo0o, reason: collision with root package name */
    public Integer f19825Oooo0o;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f19826Oooo0o0;

    static {
        HashMap map = new HashMap();
        f19810Oooo0oO = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(Integer.valueOf(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(Integer.valueOf(IronSourceError.ERROR_NT_LOAD_AFTER_LONG_INITIATION), "MEDIA_INFO_BUFFERING_START");
        map.put(Integer.valueOf(IronSourceError.ERROR_NT_INIT_FAILED_AFTER_LOAD), "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public TextureViewSurfaceTextureListenerC1647hm(Context context, C2129uo c2129uo, boolean z, boolean z2, C2090tm c2090tm) {
        super(context);
        this.f19814OooOoOO = 0;
        this.f19816OooOoo0 = 0;
        this.f19826Oooo0o0 = false;
        this.f19825Oooo0o = null;
        setSurfaceTextureListener(this);
        this.f19811OooOo = c2129uo;
        this.f19813OooOoO0 = c2090tm;
        this.f19819Oooo0 = z;
        this.f19812OooOoO = z2;
        c2090tm.OooO00o(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final int OooO() {
        if (Oooo000()) {
            return this.f19815OooOoo.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final int OooOO0() {
        if (Build.VERSION.SDK_INT < 26 || !Oooo000()) {
            return -1;
        }
        return this.f19815OooOoo.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final int OooOO0O() {
        if (Oooo000()) {
            return this.f19815OooOoo.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final int OooOO0o() {
        MediaPlayer mediaPlayer = this.f19815OooOoo;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final long OooOOO() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final int OooOOO0() {
        MediaPlayer mediaPlayer = this.f19815OooOoo;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final long OooOOOO() {
        if (this.f19825Oooo0o != null) {
            return (OooOOOo() * this.f19821Oooo00O) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final long OooOOOo() {
        if (this.f19825Oooo0o != null) {
            return OooOO0O() * this.f19825Oooo0o.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOOo() throws IllegalStateException {
        zze.zza("AdMediaPlayerView pause");
        if (Oooo000() && this.f19815OooOoo.isPlaying()) {
            this.f19815OooOoo.pause();
            OooOooo(4);
            zzs.zza.post(new RunnableC1573fm(this, 4));
        }
        this.f19816OooOoo0 = 4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final String OooOOo0() {
        return "MediaPlayer".concat(true != this.f19819Oooo0 ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOOoo() throws IllegalStateException {
        zze.zza("AdMediaPlayerView play");
        if (Oooo000()) {
            this.f19815OooOoo.start();
            OooOooo(3);
            this.f20061OooOo0O.f23374OooO0OO = true;
            zzs.zza.post(new RunnableC1573fm(this, 3));
        }
        this.f19816OooOoo0 = 3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOo(float f, float f2) {
        C2016rm c2016rm = this.f19822Oooo00o;
        if (c2016rm != null) {
            c2016rm.OooO0OO(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOo0(C1831mm c1831mm) {
        this.f19824Oooo0OO = c1831mm;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOo00(int i) throws IllegalStateException {
        zze.zza("AdMediaPlayerView seek " + i);
        if (!Oooo000()) {
            this.f19823Oooo0O0 = i;
        } else {
            this.f19815OooOoo.seekTo(i);
            this.f19823Oooo0O0 = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOo0O(String str) throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        Uri uri = Uri.parse(str);
        C1702j4 c1702j4OooO0o0 = C1702j4.OooO0o0(uri);
        if (c1702j4OooO0o0 == null || c1702j4OooO0o0.zza != null) {
            if (c1702j4OooO0o0 != null) {
                uri = Uri.parse(c1702j4OooO0o0.zza);
            }
            this.f19817OooOooO = uri;
            this.f19823Oooo0O0 = 0;
            OooOoo();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOo0o() throws IllegalStateException {
        zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f19815OooOoo;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f19815OooOoo.release();
            this.f19815OooOoo = null;
            OooOooo(0);
            this.f19816OooOoo0 = 0;
        }
        this.f19813OooOoO0.OooO0OO();
    }

    public final void OooOoo() throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        SurfaceTexture surfaceTexture;
        zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.f19817OooOooO == null || surfaceTexture2 == null) {
            return;
        }
        OooOooO(false);
        try {
            zzv.zzl();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f19815OooOoo = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f19815OooOoo.setOnCompletionListener(this);
            this.f19815OooOoo.setOnErrorListener(this);
            this.f19815OooOoo.setOnInfoListener(this);
            this.f19815OooOoo.setOnPreparedListener(this);
            this.f19815OooOoo.setOnVideoSizeChangedListener(this);
            this.f19821Oooo00O = 0;
            if (this.f19819Oooo0) {
                C2016rm c2016rm = new C2016rm(getContext());
                this.f19822Oooo00o = c2016rm;
                int width = getWidth();
                int height = getHeight();
                c2016rm.f23901Oooo00o = width;
                c2016rm.f23900Oooo00O = height;
                c2016rm.f23902Oooo0O0 = surfaceTexture2;
                this.f19822Oooo00o.start();
                C2016rm c2016rm2 = this.f19822Oooo00o;
                if (c2016rm2.f23902Oooo0O0 == null) {
                    surfaceTexture = null;
                } else {
                    try {
                        c2016rm2.f23907Oooo0oo.await();
                    } catch (InterruptedException unused) {
                    }
                    surfaceTexture = c2016rm2.f23898Oooo0;
                }
                if (surfaceTexture != null) {
                    surfaceTexture2 = surfaceTexture;
                } else {
                    this.f19822Oooo00o.OooO0O0();
                    this.f19822Oooo00o = null;
                }
            }
            this.f19815OooOoo.setDataSource(getContext(), this.f19817OooOooO);
            zzv.zzm();
            this.f19815OooOoo.setSurface(new Surface(surfaceTexture2));
            this.f19815OooOoo.setAudioStreamType(3);
            this.f19815OooOoo.setScreenOnWhilePlaying(true);
            this.f19815OooOoo.prepareAsync();
            OooOooo(1);
        } catch (IOException e) {
            e = e;
            zzo.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f19817OooOooO)), e);
            onError(this.f19815OooOoo, 1, 0);
        } catch (IllegalArgumentException e2) {
            e = e2;
            zzo.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f19817OooOooO)), e);
            onError(this.f19815OooOoo, 1, 0);
        } catch (IllegalStateException e3) {
            e = e3;
            zzo.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f19817OooOooO)), e);
            onError(this.f19815OooOoo, 1, 0);
        }
    }

    public final void OooOooO(boolean z) {
        zze.zza("AdMediaPlayerView release");
        C2016rm c2016rm = this.f19822Oooo00o;
        if (c2016rm != null) {
            c2016rm.OooO0O0();
            this.f19822Oooo00o = null;
        }
        MediaPlayer mediaPlayer = this.f19815OooOoo;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f19815OooOoo.release();
            this.f19815OooOoo = null;
            OooOooo(0);
            if (z) {
                this.f19816OooOoo0 = 0;
            }
        }
    }

    public final void OooOooo(int i) {
        C2164vm c2164vm = this.f20062OooOo0o;
        C2090tm c2090tm = this.f19813OooOoO0;
        if (i == 3) {
            c2090tm.OooO0O0();
            c2164vm.f24999OooO0Oo = true;
            c2164vm.OooO00o();
        } else if (this.f19814OooOoOO == 3) {
            c2090tm.f24343OooOOO0 = false;
            c2164vm.f24999OooO0Oo = false;
            c2164vm.OooO00o();
        }
        this.f19814OooOoOO = i;
    }

    public final boolean Oooo000() {
        int i;
        return (this.f19815OooOoo == null || (i = this.f19814OooOoOO) == -1 || i == 0 || i == 1) ? false : true;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f19821Oooo00O = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        zze.zza("AdMediaPlayerView completion");
        OooOooo(5);
        this.f19816OooOoo0 = 5;
        zzs.zza.post(new RunnableC1573fm(this, 0));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        HashMap map = f19810Oooo0oO;
        String str = (String) map.get(Integer.valueOf(i));
        String str2 = (String) map.get(Integer.valueOf(i2));
        zzo.zzj("AdMediaPlayerView MediaPlayer error: " + str + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + str2);
        OooOooo(-1);
        this.f19816OooOoo0 = -1;
        zzs.zza.post(new o000oOoO(this, str, str2, false, 4));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        HashMap map = f19810Oooo0oO;
        zze.zza("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i))) + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + ((String) map.get(Integer.valueOf(i2))));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f19818OooOooo
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)
            int r1 = r5.f19820Oooo000
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)
            int r2 = r5.f19818OooOooo
            if (r2 <= 0) goto L7a
            int r2 = r5.f19820Oooo000
            if (r2 <= 0) goto L7a
            com.google.android.gms.internal.ads.rm r2 = r5.f19822Oooo00o
            if (r2 != 0) goto L7a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L42
            int r0 = r5.f19818OooOooo
            int r1 = r0 * r7
            int r2 = r5.f19820Oooo000
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7a
        L3c:
            if (r1 <= r3) goto L60
            int r1 = r3 / r0
        L40:
            r0 = r6
            goto L7a
        L42:
            r0 = r2
        L43:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L54
            int r0 = r5.f19820Oooo000
            int r0 = r0 * r6
            int r2 = r5.f19818OooOooo
            int r0 = r0 / r2
            if (r1 != r3) goto L52
            if (r0 <= r7) goto L52
            goto L60
        L52:
            r1 = r0
            goto L40
        L54:
            if (r1 != r2) goto L64
            int r1 = r5.f19818OooOooo
            int r1 = r1 * r7
            int r2 = r5.f19820Oooo000
            int r1 = r1 / r2
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
        L60:
            r0 = r6
            goto L3a
        L62:
            r0 = r1
            goto L3a
        L64:
            int r2 = r5.f19818OooOooo
            int r4 = r5.f19820Oooo000
            if (r1 != r3) goto L70
            if (r4 <= r7) goto L70
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L72
        L70:
            r1 = r2
            r7 = r4
        L72:
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L40
        L7a:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.rm r6 = r5.f19822Oooo00o
            if (r6 == 0) goto L84
            r6.OooO00o(r0, r1)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC1647hm.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        zze.zza("AdMediaPlayerView prepared");
        OooOooo(2);
        C2090tm c2090tm = this.f19813OooOoO0;
        if (c2090tm.f24331OooO && !c2090tm.f24340OooOO0) {
            ze0.OooOOO0(c2090tm.f24337OooO0o0, c2090tm.f24335OooO0Oo, "vfr2");
            c2090tm.f24340OooOO0 = true;
        }
        zzs.zza.post(new wp0(this, false, mediaPlayer, 12));
        this.f19818OooOooo = mediaPlayer.getVideoWidth();
        this.f19820Oooo000 = mediaPlayer.getVideoHeight();
        int i = this.f19823Oooo0O0;
        if (i != 0) {
            OooOo00(i);
        }
        if (this.f19812OooOoO && Oooo000() && this.f19815OooOoo.getCurrentPosition() > 0 && this.f19816OooOoo0 != 3) {
            zze.zza("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer2 = this.f19815OooOoo;
            if (mediaPlayer2 != null) {
                try {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                } catch (IllegalStateException unused) {
                }
            } else {
                zzo.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            this.f19815OooOoo.start();
            int currentPosition = this.f19815OooOoo.getCurrentPosition();
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (Oooo000() && this.f19815OooOoo.getCurrentPosition() == currentPosition) {
                ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                if (System.currentTimeMillis() - jCurrentTimeMillis > 250) {
                    break;
                }
            }
            this.f19815OooOoo.pause();
            zzn();
        }
        zzo.zzi("AdMediaPlayerView stream dimensions: " + this.f19818OooOooo + " x " + this.f19820Oooo000);
        if (this.f19816OooOoo0 == 3) {
            OooOOoo();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        zze.zza("AdMediaPlayerView surface created");
        OooOoo();
        zzs.zza.post(new RunnableC1573fm(this, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f19815OooOoo;
        if (mediaPlayer != null && this.f19823Oooo0O0 == 0) {
            this.f19823Oooo0O0 = mediaPlayer.getCurrentPosition();
        }
        C2016rm c2016rm = this.f19822Oooo00o;
        if (c2016rm != null) {
            c2016rm.OooO0O0();
        }
        zzs.zza.post(new RunnableC1573fm(this, 2));
        OooOooO(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) throws IllegalStateException {
        zze.zza("AdMediaPlayerView surface changed");
        int i3 = this.f19816OooOoo0;
        boolean z = false;
        if (this.f19818OooOooo == i && this.f19820Oooo000 == i2) {
            z = true;
        }
        if (this.f19815OooOoo != null && i3 == 3 && z) {
            int i4 = this.f19823Oooo0O0;
            if (i4 != 0) {
                OooOo00(i4);
            }
            OooOOoo();
        }
        C2016rm c2016rm = this.f19822Oooo00o;
        if (c2016rm != null) {
            c2016rm.OooO00o(i, i2);
        }
        zzs.zza.post(new RunnableC1610gm(this, i, i2, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f19813OooOoO0.OooO0Oo(this);
        this.f20061OooOo0O.OooO00o(surfaceTexture, this.f19824Oooo0OO);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        zze.zza("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.f19818OooOooo = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f19820Oooo000 = videoHeight;
        if (this.f19818OooOooo == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        zze.zza("AdMediaPlayerView window visibility changed to " + i);
        zzs.zza.post(new com.google.android.gms.common.api.internal.Oooo000(this, i, 3));
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.View
    public final String toString() {
        return OooO0oO.OooOo.OooOoo(TextureViewSurfaceTextureListenerC1647hm.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2127um
    public final void zzn() {
        C2164vm c2164vm = this.f20062OooOo0o;
        float f = c2164vm.f24998OooO0OO ? c2164vm.f25001OooO0o0 ? 0.0f : c2164vm.f25000OooO0o : 0.0f;
        MediaPlayer mediaPlayer = this.f19815OooOoo;
        if (mediaPlayer == null) {
            zzo.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        }
    }
}
