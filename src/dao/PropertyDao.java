package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import entity.Property;

public class PropertyDao {
	public static int[] totalPage(int perPage, String city, String searchMin, String searchMax, String searchBed,
			String searchBath, String searchStatus) throws SQLException {
		// initialize 0 property and 1 page
		int array[] = { 0, 1 };
		Connection conn = BaseDao.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {
			String select = "";
			if (searchStatus == "" || searchStatus == null) {
				if (city == "" || city == null) {
					if (searchMin == "" || searchMin == null) {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property";
									pst = conn.prepareStatement(select);
								} else {
									select = "select count(*) from Property where Bathroom >= (?)";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Bedroom >= (?)";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchBed));
									pst.setInt(2, Integer.parseInt(searchBath));
								}
							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Price <= (?)";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMax));
								} else {
									select = "select count(*) from Property where (Price <= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMax));
									pst.setInt(2, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where (Price <= (?)) and (Bedroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMax));
									pst.setInt(2, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where (Price <= (?)) and (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMax));
									pst.setInt(2, Integer.parseInt(searchBed));
									pst.setInt(3, Integer.parseInt(searchBath));
								}
							}
						}

					} else {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Price >= (?)";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
								} else {
									select = "select count(*) from Property where (Price >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
									pst.setInt(2, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where (Price >= (?)) and (Bedroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
									pst.setInt(2, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where (Price >= (?)) and (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
									pst.setInt(2, Integer.parseInt(searchBed));
									pst.setInt(3, Integer.parseInt(searchBath));
								}
							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where (Price >= (?)) and (Price <= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
									pst.setInt(2, Integer.parseInt(searchMax));
								} else {
									select = "select count(*) from Property where (Price >= (?)) and (Price <= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
									pst.setInt(2, Integer.parseInt(searchMax));
									pst.setInt(3, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where (Price >= (?)) and (Price <= (?)) and (Bedroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
									pst.setInt(2, Integer.parseInt(searchMax));
									pst.setInt(3, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where (Price >= (?)) and (Price <= (?)) and (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
									pst.setInt(2, Integer.parseInt(searchMax));
									pst.setInt(3, Integer.parseInt(searchBed));
									pst.setInt(4, Integer.parseInt(searchBath));
								}
							}
						}
					}

				} else {
					if (searchMin == "" || searchMin == null) {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
								} else {
									select = "select count(*) from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Bedroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchBed));
									pst.setInt(4, Integer.parseInt(searchBath));
								}
							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMax));
								} else {
									select = "select count(*) from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMax));
									pst.setInt(4, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?)) and (Bedroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMax));
									pst.setInt(4, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?)) and (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMax));
									pst.setInt(4, Integer.parseInt(searchBed));
									pst.setInt(5, Integer.parseInt(searchBath));
								}

							}
						}

					} else {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
								} else {
									select = "select count(*) from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
									pst.setInt(4, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Bedroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
									pst.setInt(4, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
									pst.setInt(4, Integer.parseInt(searchBed));
									pst.setInt(5, Integer.parseInt(searchBath));
								}
							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
									pst.setInt(4, Integer.parseInt(searchMax));
								} else {
									select = "select count(*) from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
									pst.setInt(4, Integer.parseInt(searchMax));
									pst.setInt(5, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?)) (Bedroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
									pst.setInt(4, Integer.parseInt(searchMax));
									pst.setInt(5, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?)) (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
									pst.setInt(4, Integer.parseInt(searchMax));
									pst.setInt(5, Integer.parseInt(searchBed));
									pst.setInt(6, Integer.parseInt(searchBath));
								}
							}
						}
					}
				}
			} else if (searchStatus.equals("Rent")) {
				if (city == "" || city == null) {
					if (searchMin == "" || searchMin == null) {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Rent'";
									pst = conn.prepareStatement(select);
								} else {
									select = "select count(*) from Property where Status = 'Rent' and Bathroom >= (?)";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Rent' and Bedroom >= (?)";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where Status = 'Rent' and (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchBed));
									pst.setInt(2, Integer.parseInt(searchBath));
								}
							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Rent' and Price <= (?)";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMax));
								} else {
									select = "select count(*) from Property where Status = 'Rent' and (Price <= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMax));
									pst.setInt(2, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Rent' and (Price <= (?)) and (Bedroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMax));
									pst.setInt(2, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where Status = 'Rent' and (Price <= (?)) and (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMax));
									pst.setInt(2, Integer.parseInt(searchBed));
									pst.setInt(3, Integer.parseInt(searchBath));
								}
							}
						}

					} else {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Rent' and Price >= (?)";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
								} else {
									select = "select count(*) from Property where Status = 'Rent' and (Price >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
									pst.setInt(2, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Rent' and (Price >= (?)) and (Bedroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
									pst.setInt(2, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where Status = 'Rent' and (Price >= (?)) and (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
									pst.setInt(2, Integer.parseInt(searchBed));
									pst.setInt(3, Integer.parseInt(searchBath));
								}
							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Rent' and (Price >= (?)) and (Price <= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
									pst.setInt(2, Integer.parseInt(searchMax));
								} else {
									select = "select count(*) from Property where Status = 'Rent' and (Price >= (?)) and (Price <= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
									pst.setInt(2, Integer.parseInt(searchMax));
									pst.setInt(3, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Rent' and (Price >= (?)) and (Price <= (?)) and (Bedroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
									pst.setInt(2, Integer.parseInt(searchMax));
									pst.setInt(3, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where Status = 'Rent' and (Price >= (?)) and (Price <= (?)) and (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
									pst.setInt(2, Integer.parseInt(searchMax));
									pst.setInt(3, Integer.parseInt(searchBed));
									pst.setInt(4, Integer.parseInt(searchBath));
								}
							}
						}
					}

				} else {
					if (searchMin == "" || searchMin == null) {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Rent' and Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
								} else {
									select = "select count(*) from Property where Status = 'Rent' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Rent' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Bedroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where Status = 'Rent' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchBed));
									pst.setInt(4, Integer.parseInt(searchBath));
								}
							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Rent' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMax));
								} else {
									select = "select count(*) from Property where Status = 'Rent' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMax));
									pst.setInt(4, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Rent' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?)) and (Bedroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMax));
									pst.setInt(4, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where Status = 'Rent' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?)) and (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMax));
									pst.setInt(4, Integer.parseInt(searchBed));
									pst.setInt(5, Integer.parseInt(searchBath));
								}

							}
						}

					} else {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Rent' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
								} else {
									select = "select count(*) from Property where Status = 'Rent' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
									pst.setInt(4, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Rent' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Bedroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
									pst.setInt(4, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where Status = 'Rent' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
									pst.setInt(4, Integer.parseInt(searchBed));
									pst.setInt(5, Integer.parseInt(searchBath));
								}
							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Rent' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
									pst.setInt(4, Integer.parseInt(searchMax));
								} else {
									select = "select count(*) from Property where Status = 'Rent' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
									pst.setInt(4, Integer.parseInt(searchMax));
									pst.setInt(5, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Rent' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?)) (Bedroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
									pst.setInt(4, Integer.parseInt(searchMax));
									pst.setInt(5, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where Status = 'Rent' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?)) (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
									pst.setInt(4, Integer.parseInt(searchMax));
									pst.setInt(5, Integer.parseInt(searchBed));
									pst.setInt(6, Integer.parseInt(searchBath));
								}
							}
						}
					}
				}
			} else if (searchStatus.equals("Sale")) {
				if (city == "" || city == null) {
					if (searchMin == "" || searchMin == null) {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Sale'";
									pst = conn.prepareStatement(select);
								} else {
									select = "select count(*) from Property where Status = 'Sale' and Bathroom >= (?)";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Sale' and Bedroom >= (?)";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where Status = 'Sale' and (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchBed));
									pst.setInt(2, Integer.parseInt(searchBath));
								}
							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Sale' and Price <= (?)";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMax));
								} else {
									select = "select count(*) from Property where Status = 'Sale' and (Price <= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMax));
									pst.setInt(2, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Sale' and (Price <= (?)) and (Bedroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMax));
									pst.setInt(2, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where Status = 'Sale' and (Price <= (?)) and (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMax));
									pst.setInt(2, Integer.parseInt(searchBed));
									pst.setInt(3, Integer.parseInt(searchBath));
								}
							}
						}

					} else {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Sale' and Price >= (?)";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
								} else {
									select = "select count(*) from Property where Status = 'Sale' and (Price >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
									pst.setInt(2, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Sale' and (Price >= (?)) and (Bedroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
									pst.setInt(2, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where Status = 'Sale' and (Price >= (?)) and (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
									pst.setInt(2, Integer.parseInt(searchBed));
									pst.setInt(3, Integer.parseInt(searchBath));
								}
							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Sale' and (Price >= (?)) and (Price <= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
									pst.setInt(2, Integer.parseInt(searchMax));
								} else {
									select = "select count(*) from Property where Status = 'Sale' and (Price >= (?)) and (Price <= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
									pst.setInt(2, Integer.parseInt(searchMax));
									pst.setInt(3, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Sale' and (Price >= (?)) and (Price <= (?)) and (Bedroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
									pst.setInt(2, Integer.parseInt(searchMax));
									pst.setInt(3, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where Status = 'Sale' and (Price >= (?)) and (Price <= (?)) and (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setInt(1, Integer.parseInt(searchMin));
									pst.setInt(2, Integer.parseInt(searchMax));
									pst.setInt(3, Integer.parseInt(searchBed));
									pst.setInt(4, Integer.parseInt(searchBath));
								}
							}
						}
					}

				} else {
					if (searchMin == "" || searchMin == null) {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Sale' and Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
								} else {
									select = "select count(*) from Property where Status = 'Sale' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Sale' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Bedroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where Status = 'Sale' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchBed));
									pst.setInt(4, Integer.parseInt(searchBath));
								}
							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Sale' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMax));
								} else {
									select = "select count(*) from Property where Status = 'Sale' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMax));
									pst.setInt(4, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Sale' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?)) and (Bedroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMax));
									pst.setInt(4, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where Status = 'Sale' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?)) and (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMax));
									pst.setInt(4, Integer.parseInt(searchBed));
									pst.setInt(5, Integer.parseInt(searchBath));
								}

							}
						}

					} else {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Sale' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
								} else {
									select = "select count(*) from Property where Status = 'Sale' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
									pst.setInt(4, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Sale' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Bedroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
									pst.setInt(4, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where Status = 'Sale' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
									pst.setInt(4, Integer.parseInt(searchBed));
									pst.setInt(5, Integer.parseInt(searchBath));
								}
							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Sale' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
									pst.setInt(4, Integer.parseInt(searchMax));
								} else {
									select = "select count(*) from Property where Status = 'Sale' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
									pst.setInt(4, Integer.parseInt(searchMax));
									pst.setInt(5, Integer.parseInt(searchBath));
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select count(*) from Property where Status = 'Sale' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?)) (Bedroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
									pst.setInt(4, Integer.parseInt(searchMax));
									pst.setInt(5, Integer.parseInt(searchBed));
								} else {
									select = "select count(*) from Property where Status = 'Sale' and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?)) (Bedroom >= (?)) and (Bathroom >= (?))";
									pst = conn.prepareStatement(select);
									pst.setString(1, city);
									pst.setString(2, city);
									pst.setInt(3, Integer.parseInt(searchMin));
									pst.setInt(4, Integer.parseInt(searchMax));
									pst.setInt(5, Integer.parseInt(searchBed));
									pst.setInt(6, Integer.parseInt(searchBath));
								}
							}
						}
					}
				}
			}

			rs = pst.executeQuery();

			while (rs.next()) {
				array[0] = rs.getInt(1);
				if (array[0] == 0) {
					array[1] = 1;
				} else {
					if (array[0] % perPage == 0) {
						array[1] = array[0] / perPage;
					} else {
						array[1] = array[0] / perPage + 1;
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(rs, pst, conn);
		}
		return array;
	}

	// search from the database
	public static ArrayList<Property> searchAll(int currentPage, int perPage, String city, String searchMin,
			String searchMax, String searchBed, String searchBath, String searchStatus) throws SQLException {
		ArrayList<Property> list = new ArrayList<Property>();
		// get connection with the database
		ResultSet rs = null;
		Connection conn = BaseDao.getConnection();
		PreparedStatement pst = null;

		try {
			String select = "";
			if (searchStatus == "" || searchStatus == null) {
				if (city == "" || city == null) {
					if (searchMin == "" || searchMin == null) {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchBath));
									pst.setInt(3, (currentPage - 1) * perPage);
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchBed));
									pst.setInt(3, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchBed));
									pst.setInt(3, Integer.parseInt(searchBath));
									pst.setInt(4, (currentPage - 1) * perPage);
								}

							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Price <= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMax));
									pst.setInt(3, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Price <= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMax));
									pst.setInt(3, Integer.parseInt(searchBath));
									pst.setInt(4, (currentPage - 1) * perPage);
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Price <= (?)) and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMax));
									pst.setInt(3, Integer.parseInt(searchBed));
									pst.setInt(4, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Price <= (?)) and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMax));
									pst.setInt(3, Integer.parseInt(searchBed));
									pst.setInt(4, Integer.parseInt(searchBath));
									pst.setInt(5, (currentPage - 1) * perPage);
								}
							}
						}

					} else {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Price >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Price >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, Integer.parseInt(searchBath));
									pst.setInt(4, (currentPage - 1) * perPage);
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Price >= (?)) and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, Integer.parseInt(searchBed));
									pst.setInt(4, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Price >= (?)) and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, Integer.parseInt(searchBed));
									pst.setInt(4, Integer.parseInt(searchBath));
									pst.setInt(5, (currentPage - 1) * perPage);
								}
							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Price >= (?)) and (Price <= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, Integer.parseInt(searchMax));
									pst.setInt(4, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Price >= (?)) and (Price <= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, Integer.parseInt(searchMax));
									pst.setInt(4, Integer.parseInt(searchBath));
									pst.setInt(5, (currentPage - 1) * perPage);
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Price >= (?)) and (Price <= (?)) and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, Integer.parseInt(searchMax));
									pst.setInt(4, Integer.parseInt(searchBed));
									pst.setInt(5, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Price >= (?)) and (Price <= (?)) and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, Integer.parseInt(searchMax));
									pst.setInt(4, Integer.parseInt(searchBed));
									pst.setInt(5, Integer.parseInt(searchBath));
									pst.setInt(6, (currentPage - 1) * perPage);
								}
							}
						}
					}

				} else {
					if (searchMin == "" || searchMin == null) {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchBath));
									pst.setInt(5, (currentPage - 1) * perPage);
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchBed));
									pst.setInt(5, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchBed));
									pst.setInt(5, Integer.parseInt(searchBath));
									pst.setInt(6, (currentPage - 1) * perPage);
								}
							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMax));
									pst.setInt(5, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMax));
									pst.setInt(5, Integer.parseInt(searchBath));
									pst.setInt(6, (currentPage - 1) * perPage);
								}
							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?)) and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMax));
									pst.setInt(5, Integer.parseInt(searchBed));
									pst.setInt(6, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?)) and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMax));
									pst.setInt(5, Integer.parseInt(searchBed));
									pst.setInt(6, Integer.parseInt(searchBath));
									pst.setInt(7, (currentPage - 1) * perPage);
								}
							}
						}

					} else {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, Integer.parseInt(searchBath));
									pst.setInt(6, (currentPage - 1) * perPage);
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, Integer.parseInt(searchBed));
									pst.setInt(6, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, Integer.parseInt(searchBed));
									pst.setInt(6, Integer.parseInt(searchBath));
									pst.setInt(7, (currentPage - 1) * perPage);
								}

							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, Integer.parseInt(searchMax));
									pst.setInt(6, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, Integer.parseInt(searchMax));
									pst.setInt(6, Integer.parseInt(searchBath));
									pst.setInt(7, (currentPage - 1) * perPage);
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?)) and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, Integer.parseInt(searchMax));
									pst.setInt(6, Integer.parseInt(searchBed));
									pst.setInt(7, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?)) and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, Integer.parseInt(searchMax));
									pst.setInt(6, Integer.parseInt(searchBed));
									pst.setInt(7, Integer.parseInt(searchBath));
									pst.setInt(8, (currentPage - 1) * perPage);
								}
							}
						}
					}
				}
			} else if (searchStatus.equals("Rent")) {
				if (city == "" || city == null) {
					if (searchMin == "" || searchMin == null) {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Rent') and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Rent') and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchBath));
									pst.setInt(3, (currentPage - 1) * perPage);
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Rent') and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchBed));
									pst.setInt(3, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Rent') and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchBed));
									pst.setInt(3, Integer.parseInt(searchBath));
									pst.setInt(4, (currentPage - 1) * perPage);
								}
							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Rent') and (Price <= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMax));
									pst.setInt(3, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Rent') and (Price <= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMax));
									pst.setInt(3, Integer.parseInt(searchBath));
									pst.setInt(4, (currentPage - 1) * perPage);
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Rent') and (Price <= (?)) and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMax));
									pst.setInt(3, Integer.parseInt(searchBed));
									pst.setInt(4, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Rent') and (Price <= (?)) and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMax));
									pst.setInt(3, Integer.parseInt(searchBed));
									pst.setInt(4, Integer.parseInt(searchBath));
									pst.setInt(5, (currentPage - 1) * perPage);
								}

							}
						}

					} else {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Rent') and (Price >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Rent') and (Price >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, Integer.parseInt(searchBath));
									pst.setInt(4, (currentPage - 1) * perPage);
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Rent') and (Price >= (?)) and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, Integer.parseInt(searchBed));
									pst.setInt(4, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Rent') and (Price >= (?)) and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, Integer.parseInt(searchBed));
									pst.setInt(4, Integer.parseInt(searchBath));
									pst.setInt(5, (currentPage - 1) * perPage);
								}
							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Rent') and (Price >= (?)) and (Price <= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, Integer.parseInt(searchMax));
									pst.setInt(4, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Rent') and (Price >= (?)) and (Price <= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, Integer.parseInt(searchMax));
									pst.setInt(4, Integer.parseInt(searchBath));
									pst.setInt(5, (currentPage - 1) * perPage);
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Rent') and (Price >= (?)) and (Price <= (?)) and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, Integer.parseInt(searchMax));
									pst.setInt(4, Integer.parseInt(searchBed));
									pst.setInt(5, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Rent') and (Price >= (?)) and (Price <= (?)) and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, Integer.parseInt(searchMax));
									pst.setInt(4, Integer.parseInt(searchBed));
									pst.setInt(5, Integer.parseInt(searchBath));
									pst.setInt(6, (currentPage - 1) * perPage);
								}
							}
						}
					}

				} else {
					if (searchMin == "" || searchMin == null) {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Rent') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Rent') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchBath));
									pst.setInt(5, (currentPage - 1) * perPage);
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Rent') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchBed));
									pst.setInt(5, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Rent') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchBed));
									pst.setInt(5, Integer.parseInt(searchBath));
									pst.setInt(6, (currentPage - 1) * perPage);
								}
							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Rent') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMax));
									pst.setInt(5, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Rent') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMax));
									pst.setInt(5, Integer.parseInt(searchBath));
									pst.setInt(6, (currentPage - 1) * perPage);
								}
							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Rent') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?)) and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMax));
									pst.setInt(5, Integer.parseInt(searchBed));
									pst.setInt(6, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Rent') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?)) and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMax));
									pst.setInt(5, Integer.parseInt(searchBed));
									pst.setInt(6, Integer.parseInt(searchBath));
									pst.setInt(7, (currentPage - 1) * perPage);
								}
							}
						}

					} else {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Rent') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Rent') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, Integer.parseInt(searchBath));
									pst.setInt(6, (currentPage - 1) * perPage);
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Rent') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, Integer.parseInt(searchBed));
									pst.setInt(6, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Rent') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, Integer.parseInt(searchBed));
									pst.setInt(6, Integer.parseInt(searchBath));
									pst.setInt(7, (currentPage - 1) * perPage);
								}

							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Rent') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, Integer.parseInt(searchMax));
									pst.setInt(6, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Rent') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, Integer.parseInt(searchMax));
									pst.setInt(6, Integer.parseInt(searchBath));
									pst.setInt(7, (currentPage - 1) * perPage);
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Rent') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?)) and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, Integer.parseInt(searchMax));
									pst.setInt(6, Integer.parseInt(searchBed));
									pst.setInt(7, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Rent') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?)) and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, Integer.parseInt(searchMax));
									pst.setInt(6, Integer.parseInt(searchBed));
									pst.setInt(7, Integer.parseInt(searchBath));
									pst.setInt(8, (currentPage - 1) * perPage);
								}
							}
						}
					}
				}
			} else if (searchStatus.equals("Sale")) {
				System.out.println(searchStatus);
				if (city == "" || city == null) {
					if (searchMin == "" || searchMin == null) {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Sale') and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Sale') and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchBath));
									pst.setInt(3, (currentPage - 1) * perPage);
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Sale') and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchBed));
									pst.setInt(3, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Sale') and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchBed));
									pst.setInt(3, Integer.parseInt(searchBath));
									pst.setInt(4, (currentPage - 1) * perPage);
								}
							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Sale') and (Price <= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMax));
									pst.setInt(3, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Sale') and (Price <= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMax));
									pst.setInt(3, Integer.parseInt(searchBath));
									pst.setInt(4, (currentPage - 1) * perPage);
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Sale') and (Price <= (?)) and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMax));
									pst.setInt(3, Integer.parseInt(searchBed));
									pst.setInt(4, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Sale') and (Price <= (?)) and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMax));
									pst.setInt(3, Integer.parseInt(searchBed));
									pst.setInt(4, Integer.parseInt(searchBath));
									pst.setInt(5, (currentPage - 1) * perPage);
								}

							}
						}

					} else {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Sale') and (Price >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Sale') and (Price >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, Integer.parseInt(searchBath));
									pst.setInt(4, (currentPage - 1) * perPage);
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Sale') and (Price >= (?)) and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, Integer.parseInt(searchBed));
									pst.setInt(4, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Sale') and (Price >= (?)) and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, Integer.parseInt(searchBed));
									pst.setInt(4, Integer.parseInt(searchBath));
									pst.setInt(5, (currentPage - 1) * perPage);
								}
							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Sale') and (Price >= (?)) and (Price <= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, Integer.parseInt(searchMax));
									pst.setInt(4, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Sale') and (Price >= (?)) and (Price <= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, Integer.parseInt(searchMax));
									pst.setInt(4, Integer.parseInt(searchBath));
									pst.setInt(5, (currentPage - 1) * perPage);
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Sale') and (Price >= (?)) and (Price <= (?)) and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, Integer.parseInt(searchMax));
									pst.setInt(4, Integer.parseInt(searchBed));
									pst.setInt(5, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Sale') and (Price >= (?)) and (Price <= (?)) and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setInt(2, Integer.parseInt(searchMin));
									pst.setInt(3, Integer.parseInt(searchMax));
									pst.setInt(4, Integer.parseInt(searchBed));
									pst.setInt(5, Integer.parseInt(searchBath));
									pst.setInt(6, (currentPage - 1) * perPage);
								}
							}
						}
					}

				} else {
					if (searchMin == "" || searchMin == null) {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Sale') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Sale') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchBath));
									pst.setInt(5, (currentPage - 1) * perPage);
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Sale') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchBed));
									pst.setInt(5, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Sale') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchBed));
									pst.setInt(5, Integer.parseInt(searchBath));
									pst.setInt(6, (currentPage - 1) * perPage);
								}
							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Sale') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMax));
									pst.setInt(5, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Sale') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMax));
									pst.setInt(5, Integer.parseInt(searchBath));
									pst.setInt(6, (currentPage - 1) * perPage);
								}
							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Sale') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?)) and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMax));
									pst.setInt(5, Integer.parseInt(searchBed));
									pst.setInt(6, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Sale') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price <= (?)) and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMax));
									pst.setInt(5, Integer.parseInt(searchBed));
									pst.setInt(6, Integer.parseInt(searchBath));
									pst.setInt(7, (currentPage - 1) * perPage);
								}
							}
						}

					} else {
						if (searchMax == "" || searchMax == null) {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Sale') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Sale') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, Integer.parseInt(searchBath));
									pst.setInt(6, (currentPage - 1) * perPage);
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Sale') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, Integer.parseInt(searchBed));
									pst.setInt(6, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Sale') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, Integer.parseInt(searchBed));
									pst.setInt(6, Integer.parseInt(searchBath));
									pst.setInt(7, (currentPage - 1) * perPage);
								}

							}

						} else {
							if (searchBed == "" || searchBed == null) {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Sale') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, Integer.parseInt(searchMax));
									pst.setInt(6, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Sale') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, Integer.parseInt(searchMax));
									pst.setInt(6, Integer.parseInt(searchBath));
									pst.setInt(7, (currentPage - 1) * perPage);
								}

							} else {
								if (searchBath == "" || searchBath == null) {
									select = "select top (?) * from Property where (Status = 'Sale') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?)) and (Bedroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, Integer.parseInt(searchMax));
									pst.setInt(6, Integer.parseInt(searchBed));
									pst.setInt(7, (currentPage - 1) * perPage);
								} else {
									select = "select top (?) * from Property where (Status = 'Sale') and (Zip like CONCAT('%', ?, '%') or City like CONCAT('%', ?, '%')) and (Price >= (?)) and (Price <= (?)) and (Bedroom >= (?)) and (Bathroom >= (?)) and ID not in (select top (?) ID from Property order by ID DESC) order by ID DESC";
									pst = conn.prepareStatement(select);
									pst.setInt(1, perPage);
									pst.setString(2, city);
									pst.setString(3, city);
									pst.setInt(4, Integer.parseInt(searchMin));
									pst.setInt(5, Integer.parseInt(searchMax));
									pst.setInt(6, Integer.parseInt(searchBed));
									pst.setInt(7, Integer.parseInt(searchBath));
									pst.setInt(8, (currentPage - 1) * perPage);
								}
							}
						}
					}
				}
			}

			rs = pst.executeQuery();
			while (rs.next()) {
				Property property = new Property(rs.getInt("ID"), rs.getString("Name"), rs.getString("Status"),
						rs.getInt("Bedroom"), rs.getInt("Bathroom"), rs.getString("Zip"), rs.getString("Price"),
						rs.getString("City"), rs.getString("Address"), rs.getString("Description"), rs.getString("OwnerName"), rs.getString("OwnerEmail"));
				list.add(property);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(rs, pst, conn);
		}

		return list;
	}

}
