package ledger;

import java.math.BigDecimal;

// Treating as if all in same account for now
public record Posting (long id, String date, BigDecimal amount){
}
