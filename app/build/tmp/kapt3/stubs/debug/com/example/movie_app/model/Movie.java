package com.example.movie_app.model;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@androidx.room.Entity(tableName = "movieTable")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\'\u001a\u00020\tH\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\fH\u00c6\u0003JO\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010,\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010.H\u00d6\u0003J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001J\t\u00100\u001a\u00020\u0005H\u00d6\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u00066"}, d2 = {"Lcom/example/movie_app/model/Movie;", "Landroid/os/Parcelable;", "id", "", "title", "", "thumbnail", "releaseDate", "voteAverage", "", "overview", "isFavourite", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Z)V", "getId", "()I", "setId", "(I)V", "()Z", "setFavourite", "(Z)V", "getOverview", "()Ljava/lang/String;", "setOverview", "(Ljava/lang/String;)V", "getReleaseDate", "setReleaseDate", "getThumbnail", "setThumbnail", "getTitle", "setTitle", "getVoteAverage", "()D", "setVoteAverage", "(D)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class Movie implements android.os.Parcelable {
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    @com.google.gson.annotations.SerializedName(value = "id")
    private int id;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "title")
    @com.google.gson.annotations.SerializedName(value = "title")
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "thumbnail")
    @com.google.gson.annotations.SerializedName(value = "poster_path")
    private java.lang.String thumbnail;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "rating")
    @com.google.gson.annotations.SerializedName(value = "release_date")
    private java.lang.String releaseDate;
    @androidx.room.ColumnInfo(name = "vote_average")
    @com.google.gson.annotations.SerializedName(value = "vote_average")
    private double voteAverage;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "overview")
    @com.google.gson.annotations.SerializedName(value = "overview")
    private java.lang.String overview;
    @androidx.room.ColumnInfo(name = "favourite")
    private transient boolean isFavourite;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getThumbnail() {
        return null;
    }
    
    public final void setThumbnail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    public final void setReleaseDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getVoteAverage() {
        return 0.0;
    }
    
    public final void setVoteAverage(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOverview() {
        return null;
    }
    
    public final void setOverview(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isFavourite() {
        return false;
    }
    
    public final void setFavourite(boolean p0) {
    }
    
    public Movie(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String thumbnail, @org.jetbrains.annotations.NotNull()
    java.lang.String releaseDate, double voteAverage, @org.jetbrains.annotations.NotNull()
    java.lang.String overview, boolean isFavourite) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movie_app.model.Movie copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String thumbnail, @org.jetbrains.annotations.NotNull()
    java.lang.String releaseDate, double voteAverage, @org.jetbrains.annotations.NotNull()
    java.lang.String overview, boolean isFavourite) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}