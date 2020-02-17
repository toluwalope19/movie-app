package com.example.movie_app.model.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.movie_app.model.Movie;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDao_Impl implements MovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Movie> __insertionAdapterOfMovie;

  private final EntityDeletionOrUpdateAdapter<Movie> __deletionAdapterOfMovie;

  public MovieDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovie = new EntityInsertionAdapter<Movie>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `movieTable` (`id`,`title`,`thumbnail`,`rating`,`vote_average`,`overview`,`backdrop`,`favourite`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Movie value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getThumbnail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getThumbnail());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getReleaseDate());
        }
        stmt.bindDouble(5, value.getVoteAverage());
        if (value.getOverview() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getOverview());
        }
        if (value.getBackdrop() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getBackdrop());
        }
        final int _tmp;
        _tmp = value.isFavourite() ? 1 : 0;
        stmt.bindLong(8, _tmp);
      }
    };
    this.__deletionAdapterOfMovie = new EntityDeletionOrUpdateAdapter<Movie>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `movieTable` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Movie value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Object insertFavourite(final Movie movie, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMovie.insert(movie);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object removeFavourite(final Movie movie, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfMovie.handle(movie);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<Movie>> getFavourites() {
    final String _sql = "SELECT * from movieTable ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"movieTable"}, false, new Callable<List<Movie>>() {
      @Override
      public List<Movie> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfThumbnail = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnail");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfBackdrop = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop");
          final int _cursorIndexOfIsFavourite = CursorUtil.getColumnIndexOrThrow(_cursor, "favourite");
          final List<Movie> _result = new ArrayList<Movie>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Movie _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpThumbnail;
            _tmpThumbnail = _cursor.getString(_cursorIndexOfThumbnail);
            final String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            final double _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final String _tmpBackdrop;
            _tmpBackdrop = _cursor.getString(_cursorIndexOfBackdrop);
            final boolean _tmpIsFavourite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavourite);
            _tmpIsFavourite = _tmp != 0;
            _item = new Movie(_tmpId,_tmpTitle,_tmpThumbnail,_tmpReleaseDate,_tmpVoteAverage,_tmpOverview,_tmpBackdrop,_tmpIsFavourite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<Movie> isFavorite(final long id) {
    final String _sql = "SELECT * from movieTable where id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfThumbnail = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnail");
      final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
      final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
      final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
      final int _cursorIndexOfBackdrop = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop");
      final int _cursorIndexOfIsFavourite = CursorUtil.getColumnIndexOrThrow(_cursor, "favourite");
      final List<Movie> _result = new ArrayList<Movie>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Movie _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final String _tmpThumbnail;
        _tmpThumbnail = _cursor.getString(_cursorIndexOfThumbnail);
        final String _tmpReleaseDate;
        _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
        final double _tmpVoteAverage;
        _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
        final String _tmpOverview;
        _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
        final String _tmpBackdrop;
        _tmpBackdrop = _cursor.getString(_cursorIndexOfBackdrop);
        final boolean _tmpIsFavourite;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsFavourite);
        _tmpIsFavourite = _tmp != 0;
        _item = new Movie(_tmpId,_tmpTitle,_tmpThumbnail,_tmpReleaseDate,_tmpVoteAverage,_tmpOverview,_tmpBackdrop,_tmpIsFavourite);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
