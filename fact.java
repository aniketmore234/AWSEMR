// ORM class for table 'fact'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu May 31 12:41:27 UTC 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class fact extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer fact_id;
  public Integer get_fact_id() {
    return fact_id;
  }
  public void set_fact_id(Integer fact_id) {
    this.fact_id = fact_id;
  }
  public fact with_fact_id(Integer fact_id) {
    this.fact_id = fact_id;
    return this;
  }
  private Integer name_id;
  public Integer get_name_id() {
    return name_id;
  }
  public void set_name_id(Integer name_id) {
    this.name_id = name_id;
  }
  public fact with_name_id(Integer name_id) {
    this.name_id = name_id;
    return this;
  }
  private Integer date_id;
  public Integer get_date_id() {
    return date_id;
  }
  public void set_date_id(Integer date_id) {
    this.date_id = date_id;
  }
  public fact with_date_id(Integer date_id) {
    this.date_id = date_id;
    return this;
  }
  private Integer equity_id;
  public Integer get_equity_id() {
    return equity_id;
  }
  public void set_equity_id(Integer equity_id) {
    this.equity_id = equity_id;
  }
  public fact with_equity_id(Integer equity_id) {
    this.equity_id = equity_id;
    return this;
  }
  private Float Prev_Close;
  public Float get_Prev_Close() {
    return Prev_Close;
  }
  public void set_Prev_Close(Float Prev_Close) {
    this.Prev_Close = Prev_Close;
  }
  public fact with_Prev_Close(Float Prev_Close) {
    this.Prev_Close = Prev_Close;
    return this;
  }
  private Float Open_Price;
  public Float get_Open_Price() {
    return Open_Price;
  }
  public void set_Open_Price(Float Open_Price) {
    this.Open_Price = Open_Price;
  }
  public fact with_Open_Price(Float Open_Price) {
    this.Open_Price = Open_Price;
    return this;
  }
  private Float High_Price;
  public Float get_High_Price() {
    return High_Price;
  }
  public void set_High_Price(Float High_Price) {
    this.High_Price = High_Price;
  }
  public fact with_High_Price(Float High_Price) {
    this.High_Price = High_Price;
    return this;
  }
  private Float Low_Price;
  public Float get_Low_Price() {
    return Low_Price;
  }
  public void set_Low_Price(Float Low_Price) {
    this.Low_Price = Low_Price;
  }
  public fact with_Low_Price(Float Low_Price) {
    this.Low_Price = Low_Price;
    return this;
  }
  private Float Last_Price;
  public Float get_Last_Price() {
    return Last_Price;
  }
  public void set_Last_Price(Float Last_Price) {
    this.Last_Price = Last_Price;
  }
  public fact with_Last_Price(Float Last_Price) {
    this.Last_Price = Last_Price;
    return this;
  }
  private Float Close_Price;
  public Float get_Close_Price() {
    return Close_Price;
  }
  public void set_Close_Price(Float Close_Price) {
    this.Close_Price = Close_Price;
  }
  public fact with_Close_Price(Float Close_Price) {
    this.Close_Price = Close_Price;
    return this;
  }
  private Float Average_Price;
  public Float get_Average_Price() {
    return Average_Price;
  }
  public void set_Average_Price(Float Average_Price) {
    this.Average_Price = Average_Price;
  }
  public fact with_Average_Price(Float Average_Price) {
    this.Average_Price = Average_Price;
    return this;
  }
  private Long Total_Traded_Quantity;
  public Long get_Total_Traded_Quantity() {
    return Total_Traded_Quantity;
  }
  public void set_Total_Traded_Quantity(Long Total_Traded_Quantity) {
    this.Total_Traded_Quantity = Total_Traded_Quantity;
  }
  public fact with_Total_Traded_Quantity(Long Total_Traded_Quantity) {
    this.Total_Traded_Quantity = Total_Traded_Quantity;
    return this;
  }
  private Float Turnover;
  public Float get_Turnover() {
    return Turnover;
  }
  public void set_Turnover(Float Turnover) {
    this.Turnover = Turnover;
  }
  public fact with_Turnover(Float Turnover) {
    this.Turnover = Turnover;
    return this;
  }
  private Long No_of_Trades;
  public Long get_No_of_Trades() {
    return No_of_Trades;
  }
  public void set_No_of_Trades(Long No_of_Trades) {
    this.No_of_Trades = No_of_Trades;
  }
  public fact with_No_of_Trades(Long No_of_Trades) {
    this.No_of_Trades = No_of_Trades;
    return this;
  }
  private Float Deliverable_Qty;
  public Float get_Deliverable_Qty() {
    return Deliverable_Qty;
  }
  public void set_Deliverable_Qty(Float Deliverable_Qty) {
    this.Deliverable_Qty = Deliverable_Qty;
  }
  public fact with_Deliverable_Qty(Float Deliverable_Qty) {
    this.Deliverable_Qty = Deliverable_Qty;
    return this;
  }
  private Float Dly_Qt_to_Traded_Qty;
  public Float get_Dly_Qt_to_Traded_Qty() {
    return Dly_Qt_to_Traded_Qty;
  }
  public void set_Dly_Qt_to_Traded_Qty(Float Dly_Qt_to_Traded_Qty) {
    this.Dly_Qt_to_Traded_Qty = Dly_Qt_to_Traded_Qty;
  }
  public fact with_Dly_Qt_to_Traded_Qty(Float Dly_Qt_to_Traded_Qty) {
    this.Dly_Qt_to_Traded_Qty = Dly_Qt_to_Traded_Qty;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof fact)) {
      return false;
    }
    fact that = (fact) o;
    boolean equal = true;
    equal = equal && (this.fact_id == null ? that.fact_id == null : this.fact_id.equals(that.fact_id));
    equal = equal && (this.name_id == null ? that.name_id == null : this.name_id.equals(that.name_id));
    equal = equal && (this.date_id == null ? that.date_id == null : this.date_id.equals(that.date_id));
    equal = equal && (this.equity_id == null ? that.equity_id == null : this.equity_id.equals(that.equity_id));
    equal = equal && (this.Prev_Close == null ? that.Prev_Close == null : this.Prev_Close.equals(that.Prev_Close));
    equal = equal && (this.Open_Price == null ? that.Open_Price == null : this.Open_Price.equals(that.Open_Price));
    equal = equal && (this.High_Price == null ? that.High_Price == null : this.High_Price.equals(that.High_Price));
    equal = equal && (this.Low_Price == null ? that.Low_Price == null : this.Low_Price.equals(that.Low_Price));
    equal = equal && (this.Last_Price == null ? that.Last_Price == null : this.Last_Price.equals(that.Last_Price));
    equal = equal && (this.Close_Price == null ? that.Close_Price == null : this.Close_Price.equals(that.Close_Price));
    equal = equal && (this.Average_Price == null ? that.Average_Price == null : this.Average_Price.equals(that.Average_Price));
    equal = equal && (this.Total_Traded_Quantity == null ? that.Total_Traded_Quantity == null : this.Total_Traded_Quantity.equals(that.Total_Traded_Quantity));
    equal = equal && (this.Turnover == null ? that.Turnover == null : this.Turnover.equals(that.Turnover));
    equal = equal && (this.No_of_Trades == null ? that.No_of_Trades == null : this.No_of_Trades.equals(that.No_of_Trades));
    equal = equal && (this.Deliverable_Qty == null ? that.Deliverable_Qty == null : this.Deliverable_Qty.equals(that.Deliverable_Qty));
    equal = equal && (this.Dly_Qt_to_Traded_Qty == null ? that.Dly_Qt_to_Traded_Qty == null : this.Dly_Qt_to_Traded_Qty.equals(that.Dly_Qt_to_Traded_Qty));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof fact)) {
      return false;
    }
    fact that = (fact) o;
    boolean equal = true;
    equal = equal && (this.fact_id == null ? that.fact_id == null : this.fact_id.equals(that.fact_id));
    equal = equal && (this.name_id == null ? that.name_id == null : this.name_id.equals(that.name_id));
    equal = equal && (this.date_id == null ? that.date_id == null : this.date_id.equals(that.date_id));
    equal = equal && (this.equity_id == null ? that.equity_id == null : this.equity_id.equals(that.equity_id));
    equal = equal && (this.Prev_Close == null ? that.Prev_Close == null : this.Prev_Close.equals(that.Prev_Close));
    equal = equal && (this.Open_Price == null ? that.Open_Price == null : this.Open_Price.equals(that.Open_Price));
    equal = equal && (this.High_Price == null ? that.High_Price == null : this.High_Price.equals(that.High_Price));
    equal = equal && (this.Low_Price == null ? that.Low_Price == null : this.Low_Price.equals(that.Low_Price));
    equal = equal && (this.Last_Price == null ? that.Last_Price == null : this.Last_Price.equals(that.Last_Price));
    equal = equal && (this.Close_Price == null ? that.Close_Price == null : this.Close_Price.equals(that.Close_Price));
    equal = equal && (this.Average_Price == null ? that.Average_Price == null : this.Average_Price.equals(that.Average_Price));
    equal = equal && (this.Total_Traded_Quantity == null ? that.Total_Traded_Quantity == null : this.Total_Traded_Quantity.equals(that.Total_Traded_Quantity));
    equal = equal && (this.Turnover == null ? that.Turnover == null : this.Turnover.equals(that.Turnover));
    equal = equal && (this.No_of_Trades == null ? that.No_of_Trades == null : this.No_of_Trades.equals(that.No_of_Trades));
    equal = equal && (this.Deliverable_Qty == null ? that.Deliverable_Qty == null : this.Deliverable_Qty.equals(that.Deliverable_Qty));
    equal = equal && (this.Dly_Qt_to_Traded_Qty == null ? that.Dly_Qt_to_Traded_Qty == null : this.Dly_Qt_to_Traded_Qty.equals(that.Dly_Qt_to_Traded_Qty));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fact_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.name_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.date_id = JdbcWritableBridge.readInteger(3, __dbResults);
    this.equity_id = JdbcWritableBridge.readInteger(4, __dbResults);
    this.Prev_Close = JdbcWritableBridge.readFloat(5, __dbResults);
    this.Open_Price = JdbcWritableBridge.readFloat(6, __dbResults);
    this.High_Price = JdbcWritableBridge.readFloat(7, __dbResults);
    this.Low_Price = JdbcWritableBridge.readFloat(8, __dbResults);
    this.Last_Price = JdbcWritableBridge.readFloat(9, __dbResults);
    this.Close_Price = JdbcWritableBridge.readFloat(10, __dbResults);
    this.Average_Price = JdbcWritableBridge.readFloat(11, __dbResults);
    this.Total_Traded_Quantity = JdbcWritableBridge.readLong(12, __dbResults);
    this.Turnover = JdbcWritableBridge.readFloat(13, __dbResults);
    this.No_of_Trades = JdbcWritableBridge.readLong(14, __dbResults);
    this.Deliverable_Qty = JdbcWritableBridge.readFloat(15, __dbResults);
    this.Dly_Qt_to_Traded_Qty = JdbcWritableBridge.readFloat(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fact_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.name_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.date_id = JdbcWritableBridge.readInteger(3, __dbResults);
    this.equity_id = JdbcWritableBridge.readInteger(4, __dbResults);
    this.Prev_Close = JdbcWritableBridge.readFloat(5, __dbResults);
    this.Open_Price = JdbcWritableBridge.readFloat(6, __dbResults);
    this.High_Price = JdbcWritableBridge.readFloat(7, __dbResults);
    this.Low_Price = JdbcWritableBridge.readFloat(8, __dbResults);
    this.Last_Price = JdbcWritableBridge.readFloat(9, __dbResults);
    this.Close_Price = JdbcWritableBridge.readFloat(10, __dbResults);
    this.Average_Price = JdbcWritableBridge.readFloat(11, __dbResults);
    this.Total_Traded_Quantity = JdbcWritableBridge.readLong(12, __dbResults);
    this.Turnover = JdbcWritableBridge.readFloat(13, __dbResults);
    this.No_of_Trades = JdbcWritableBridge.readLong(14, __dbResults);
    this.Deliverable_Qty = JdbcWritableBridge.readFloat(15, __dbResults);
    this.Dly_Qt_to_Traded_Qty = JdbcWritableBridge.readFloat(16, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(fact_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(name_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(date_id, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(equity_id, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(Prev_Close, 5 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(Open_Price, 6 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(High_Price, 7 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(Low_Price, 8 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(Last_Price, 9 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(Close_Price, 10 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(Average_Price, 11 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeLong(Total_Traded_Quantity, 12 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeFloat(Turnover, 13 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeLong(No_of_Trades, 14 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeFloat(Deliverable_Qty, 15 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(Dly_Qt_to_Traded_Qty, 16 + __off, 7, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(fact_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(name_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(date_id, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(equity_id, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(Prev_Close, 5 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(Open_Price, 6 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(High_Price, 7 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(Low_Price, 8 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(Last_Price, 9 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(Close_Price, 10 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(Average_Price, 11 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeLong(Total_Traded_Quantity, 12 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeFloat(Turnover, 13 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeLong(No_of_Trades, 14 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeFloat(Deliverable_Qty, 15 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(Dly_Qt_to_Traded_Qty, 16 + __off, 7, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fact_id = null;
    } else {
    this.fact_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.name_id = null;
    } else {
    this.name_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.date_id = null;
    } else {
    this.date_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.equity_id = null;
    } else {
    this.equity_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Prev_Close = null;
    } else {
    this.Prev_Close = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.Open_Price = null;
    } else {
    this.Open_Price = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.High_Price = null;
    } else {
    this.High_Price = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.Low_Price = null;
    } else {
    this.Low_Price = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.Last_Price = null;
    } else {
    this.Last_Price = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.Close_Price = null;
    } else {
    this.Close_Price = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.Average_Price = null;
    } else {
    this.Average_Price = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.Total_Traded_Quantity = null;
    } else {
    this.Total_Traded_Quantity = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Turnover = null;
    } else {
    this.Turnover = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.No_of_Trades = null;
    } else {
    this.No_of_Trades = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Deliverable_Qty = null;
    } else {
    this.Deliverable_Qty = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.Dly_Qt_to_Traded_Qty = null;
    } else {
    this.Dly_Qt_to_Traded_Qty = Float.valueOf(__dataIn.readFloat());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.fact_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fact_id);
    }
    if (null == this.name_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.name_id);
    }
    if (null == this.date_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.date_id);
    }
    if (null == this.equity_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.equity_id);
    }
    if (null == this.Prev_Close) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Prev_Close);
    }
    if (null == this.Open_Price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Open_Price);
    }
    if (null == this.High_Price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.High_Price);
    }
    if (null == this.Low_Price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Low_Price);
    }
    if (null == this.Last_Price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Last_Price);
    }
    if (null == this.Close_Price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Close_Price);
    }
    if (null == this.Average_Price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Average_Price);
    }
    if (null == this.Total_Traded_Quantity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Total_Traded_Quantity);
    }
    if (null == this.Turnover) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Turnover);
    }
    if (null == this.No_of_Trades) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.No_of_Trades);
    }
    if (null == this.Deliverable_Qty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Deliverable_Qty);
    }
    if (null == this.Dly_Qt_to_Traded_Qty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Dly_Qt_to_Traded_Qty);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.fact_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fact_id);
    }
    if (null == this.name_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.name_id);
    }
    if (null == this.date_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.date_id);
    }
    if (null == this.equity_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.equity_id);
    }
    if (null == this.Prev_Close) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Prev_Close);
    }
    if (null == this.Open_Price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Open_Price);
    }
    if (null == this.High_Price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.High_Price);
    }
    if (null == this.Low_Price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Low_Price);
    }
    if (null == this.Last_Price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Last_Price);
    }
    if (null == this.Close_Price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Close_Price);
    }
    if (null == this.Average_Price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Average_Price);
    }
    if (null == this.Total_Traded_Quantity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Total_Traded_Quantity);
    }
    if (null == this.Turnover) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Turnover);
    }
    if (null == this.No_of_Trades) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.No_of_Trades);
    }
    if (null == this.Deliverable_Qty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Deliverable_Qty);
    }
    if (null == this.Dly_Qt_to_Traded_Qty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Dly_Qt_to_Traded_Qty);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(fact_id==null?"null":"" + fact_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name_id==null?"null":"" + name_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_id==null?"null":"" + date_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(equity_id==null?"null":"" + equity_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Prev_Close==null?"null":"" + Prev_Close, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Open_Price==null?"null":"" + Open_Price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(High_Price==null?"null":"" + High_Price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Low_Price==null?"null":"" + Low_Price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Last_Price==null?"null":"" + Last_Price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Close_Price==null?"null":"" + Close_Price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Average_Price==null?"null":"" + Average_Price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Total_Traded_Quantity==null?"null":"" + Total_Traded_Quantity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Turnover==null?"null":"" + Turnover, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(No_of_Trades==null?"null":"" + No_of_Trades, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Deliverable_Qty==null?"null":"" + Deliverable_Qty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Dly_Qt_to_Traded_Qty==null?"null":"" + Dly_Qt_to_Traded_Qty, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(fact_id==null?"null":"" + fact_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name_id==null?"null":"" + name_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_id==null?"null":"" + date_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(equity_id==null?"null":"" + equity_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Prev_Close==null?"null":"" + Prev_Close, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Open_Price==null?"null":"" + Open_Price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(High_Price==null?"null":"" + High_Price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Low_Price==null?"null":"" + Low_Price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Last_Price==null?"null":"" + Last_Price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Close_Price==null?"null":"" + Close_Price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Average_Price==null?"null":"" + Average_Price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Total_Traded_Quantity==null?"null":"" + Total_Traded_Quantity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Turnover==null?"null":"" + Turnover, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(No_of_Trades==null?"null":"" + No_of_Trades, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Deliverable_Qty==null?"null":"" + Deliverable_Qty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Dly_Qt_to_Traded_Qty==null?"null":"" + Dly_Qt_to_Traded_Qty, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fact_id = null; } else {
      this.fact_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.name_id = null; } else {
      this.name_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.date_id = null; } else {
      this.date_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.equity_id = null; } else {
      this.equity_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Prev_Close = null; } else {
      this.Prev_Close = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Open_Price = null; } else {
      this.Open_Price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.High_Price = null; } else {
      this.High_Price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Low_Price = null; } else {
      this.Low_Price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Last_Price = null; } else {
      this.Last_Price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Close_Price = null; } else {
      this.Close_Price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Average_Price = null; } else {
      this.Average_Price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Total_Traded_Quantity = null; } else {
      this.Total_Traded_Quantity = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Turnover = null; } else {
      this.Turnover = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.No_of_Trades = null; } else {
      this.No_of_Trades = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Deliverable_Qty = null; } else {
      this.Deliverable_Qty = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Dly_Qt_to_Traded_Qty = null; } else {
      this.Dly_Qt_to_Traded_Qty = Float.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fact_id = null; } else {
      this.fact_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.name_id = null; } else {
      this.name_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.date_id = null; } else {
      this.date_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.equity_id = null; } else {
      this.equity_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Prev_Close = null; } else {
      this.Prev_Close = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Open_Price = null; } else {
      this.Open_Price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.High_Price = null; } else {
      this.High_Price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Low_Price = null; } else {
      this.Low_Price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Last_Price = null; } else {
      this.Last_Price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Close_Price = null; } else {
      this.Close_Price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Average_Price = null; } else {
      this.Average_Price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Total_Traded_Quantity = null; } else {
      this.Total_Traded_Quantity = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Turnover = null; } else {
      this.Turnover = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.No_of_Trades = null; } else {
      this.No_of_Trades = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Deliverable_Qty = null; } else {
      this.Deliverable_Qty = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Dly_Qt_to_Traded_Qty = null; } else {
      this.Dly_Qt_to_Traded_Qty = Float.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    fact o = (fact) super.clone();
    return o;
  }

  public void clone0(fact o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("fact_id", this.fact_id);
    __sqoop$field_map.put("name_id", this.name_id);
    __sqoop$field_map.put("date_id", this.date_id);
    __sqoop$field_map.put("equity_id", this.equity_id);
    __sqoop$field_map.put("Prev_Close", this.Prev_Close);
    __sqoop$field_map.put("Open_Price", this.Open_Price);
    __sqoop$field_map.put("High_Price", this.High_Price);
    __sqoop$field_map.put("Low_Price", this.Low_Price);
    __sqoop$field_map.put("Last_Price", this.Last_Price);
    __sqoop$field_map.put("Close_Price", this.Close_Price);
    __sqoop$field_map.put("Average_Price", this.Average_Price);
    __sqoop$field_map.put("Total_Traded_Quantity", this.Total_Traded_Quantity);
    __sqoop$field_map.put("Turnover", this.Turnover);
    __sqoop$field_map.put("No_of_Trades", this.No_of_Trades);
    __sqoop$field_map.put("Deliverable_Qty", this.Deliverable_Qty);
    __sqoop$field_map.put("Dly_Qt_to_Traded_Qty", this.Dly_Qt_to_Traded_Qty);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fact_id", this.fact_id);
    __sqoop$field_map.put("name_id", this.name_id);
    __sqoop$field_map.put("date_id", this.date_id);
    __sqoop$field_map.put("equity_id", this.equity_id);
    __sqoop$field_map.put("Prev_Close", this.Prev_Close);
    __sqoop$field_map.put("Open_Price", this.Open_Price);
    __sqoop$field_map.put("High_Price", this.High_Price);
    __sqoop$field_map.put("Low_Price", this.Low_Price);
    __sqoop$field_map.put("Last_Price", this.Last_Price);
    __sqoop$field_map.put("Close_Price", this.Close_Price);
    __sqoop$field_map.put("Average_Price", this.Average_Price);
    __sqoop$field_map.put("Total_Traded_Quantity", this.Total_Traded_Quantity);
    __sqoop$field_map.put("Turnover", this.Turnover);
    __sqoop$field_map.put("No_of_Trades", this.No_of_Trades);
    __sqoop$field_map.put("Deliverable_Qty", this.Deliverable_Qty);
    __sqoop$field_map.put("Dly_Qt_to_Traded_Qty", this.Dly_Qt_to_Traded_Qty);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("fact_id".equals(__fieldName)) {
      this.fact_id = (Integer) __fieldVal;
    }
    else    if ("name_id".equals(__fieldName)) {
      this.name_id = (Integer) __fieldVal;
    }
    else    if ("date_id".equals(__fieldName)) {
      this.date_id = (Integer) __fieldVal;
    }
    else    if ("equity_id".equals(__fieldName)) {
      this.equity_id = (Integer) __fieldVal;
    }
    else    if ("Prev_Close".equals(__fieldName)) {
      this.Prev_Close = (Float) __fieldVal;
    }
    else    if ("Open_Price".equals(__fieldName)) {
      this.Open_Price = (Float) __fieldVal;
    }
    else    if ("High_Price".equals(__fieldName)) {
      this.High_Price = (Float) __fieldVal;
    }
    else    if ("Low_Price".equals(__fieldName)) {
      this.Low_Price = (Float) __fieldVal;
    }
    else    if ("Last_Price".equals(__fieldName)) {
      this.Last_Price = (Float) __fieldVal;
    }
    else    if ("Close_Price".equals(__fieldName)) {
      this.Close_Price = (Float) __fieldVal;
    }
    else    if ("Average_Price".equals(__fieldName)) {
      this.Average_Price = (Float) __fieldVal;
    }
    else    if ("Total_Traded_Quantity".equals(__fieldName)) {
      this.Total_Traded_Quantity = (Long) __fieldVal;
    }
    else    if ("Turnover".equals(__fieldName)) {
      this.Turnover = (Float) __fieldVal;
    }
    else    if ("No_of_Trades".equals(__fieldName)) {
      this.No_of_Trades = (Long) __fieldVal;
    }
    else    if ("Deliverable_Qty".equals(__fieldName)) {
      this.Deliverable_Qty = (Float) __fieldVal;
    }
    else    if ("Dly_Qt_to_Traded_Qty".equals(__fieldName)) {
      this.Dly_Qt_to_Traded_Qty = (Float) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("fact_id".equals(__fieldName)) {
      this.fact_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("name_id".equals(__fieldName)) {
      this.name_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("date_id".equals(__fieldName)) {
      this.date_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("equity_id".equals(__fieldName)) {
      this.equity_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("Prev_Close".equals(__fieldName)) {
      this.Prev_Close = (Float) __fieldVal;
      return true;
    }
    else    if ("Open_Price".equals(__fieldName)) {
      this.Open_Price = (Float) __fieldVal;
      return true;
    }
    else    if ("High_Price".equals(__fieldName)) {
      this.High_Price = (Float) __fieldVal;
      return true;
    }
    else    if ("Low_Price".equals(__fieldName)) {
      this.Low_Price = (Float) __fieldVal;
      return true;
    }
    else    if ("Last_Price".equals(__fieldName)) {
      this.Last_Price = (Float) __fieldVal;
      return true;
    }
    else    if ("Close_Price".equals(__fieldName)) {
      this.Close_Price = (Float) __fieldVal;
      return true;
    }
    else    if ("Average_Price".equals(__fieldName)) {
      this.Average_Price = (Float) __fieldVal;
      return true;
    }
    else    if ("Total_Traded_Quantity".equals(__fieldName)) {
      this.Total_Traded_Quantity = (Long) __fieldVal;
      return true;
    }
    else    if ("Turnover".equals(__fieldName)) {
      this.Turnover = (Float) __fieldVal;
      return true;
    }
    else    if ("No_of_Trades".equals(__fieldName)) {
      this.No_of_Trades = (Long) __fieldVal;
      return true;
    }
    else    if ("Deliverable_Qty".equals(__fieldName)) {
      this.Deliverable_Qty = (Float) __fieldVal;
      return true;
    }
    else    if ("Dly_Qt_to_Traded_Qty".equals(__fieldName)) {
      this.Dly_Qt_to_Traded_Qty = (Float) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
